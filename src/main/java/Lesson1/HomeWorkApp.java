package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 2, s;
        s = a + b;
        if (s >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("�������");

        }
        if (value > 0 && value <= 100) {
            System.out.println("������");

        }
        if (value > 100) {
            System.out.println("�������");

        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
