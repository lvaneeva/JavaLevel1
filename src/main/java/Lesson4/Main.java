
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] field = initField(5 );
        printField(field);

        while (true) {
            //
            humanTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinner(field, "X")) {
                System.out.println("Вы выйграли :)");
                break;
            }

            //
            aiTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinner(field, "0")) {
                System.out.println("Компьютер победил :|");
                break;
            }

        }
        System.out.println("Конец игры");
    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }
    public static void humanTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Сделайте ход x y: ");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0) {

                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Поле занято");
                }

            } else {
                System.out.println("Вы вышли за границы игрового поля");
            }

        }
    }

    public static void aiTurn(String[][] field) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (field[x][y].equals("*")) {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("Компьютер сделал ход");
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWinner(String[][] field, String turn) {
        int c_d1 = 0, c_d2=0, c_d3=0, c_d4=0, c_g, c_v;
        int size=field.length, win;
        switch (size) {
            case 3: win=3;
                break;
            case 5: win=4;
                break;
            default: win=size;
                break;
        }
        for (int i = 0; i < field.length; i++) {
            c_g = 0;
            c_v = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals(turn)) {
                    c_g++;
                }
                if (field[j][i].equals(turn)) {
                    c_v++;
                }
                if (i == j && field[i][j].equals(turn)) {
                    c_d1++;
                }
                if ((i + j==size-2 ) && field[i][j].equals(turn)) {
                    c_d2++;
                }
                if ((i + j==size-1 ) && field[i][j].equals(turn)) {
                    c_d3++;
                }
                if ((i + j==size ) && field[i][j].equals(turn)) {
                    c_d4++;
                }
                if (c_d1 == win || c_g == win || c_v == win || c_d2 == win || c_d3 == win || c_d4 == win) {
                    return true;
                }
            }
        }

        //
         /*if (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ||
                field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) ||
                field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)
        ) {
                return true;
        }
         */
        /*if (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) ||
                field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) ||
                field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)) {
            return true;
        }
        //
        else if (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) ||
                field[2][0].equals(turn) && field[1][1].equals(turn) && field[0][2].equals(turn)) {
            return true;
        }*/

        return false;
    }
}


