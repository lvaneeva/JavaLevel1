package Lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0; */

        int[] massiv1={1,1,0,0,1,0,1,1,0};
        for (int i=0; i< massiv1.length; i++){
            if (massiv1[i]==0) {
                massiv1[i]=1;
            }
            else  massiv1[i]=0;
        }
        System.out.println(Arrays.toString(massiv1));

        /* 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
        1 2 3 4 5 6 7 8 … 100;*/

        int[] massivSotka=new int[100];
        for (int i=0; i<100; i++){
            massivSotka[i]=i+1;
        }
        System.out.println(Arrays.toString(massivSotka));

        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        умножить на 2; */

        int[] massiv3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< massiv3.length; i++){
            if (massiv3[i]<6) {
                massiv3[i]*=2;
            }
        }
        System.out.println(Arrays.toString(massiv3));

        /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с
        помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если
        обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов
         равны, то есть [0][0], [1][1], [2][2], …, [n][n]; */

        int[][] d=new int[5][5];

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==j || (i+j)==4) {
                    d[i][j]=1;
                } else {
                    d[i][j]=8;
                }
            }
        }
        printArr(d);

        int[] arr5=sozdatMassiv(3,5); //вызов метода из 5-го задания, сам метод ниже
        System.out.println(Arrays.toString(arr5));

        /* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */

        int[] arr6={1, 2, 10, 0, -8, 5};
        int min=arr6[0], max=arr6[0];
        int min_i=0, max_i=0;
        for (int i=0; i<arr6.length; i++) {
            if (arr6[i]<min) {
                min=arr6[i];
                min_i=i;
            }
            if (arr6[i]>max) {
                max=arr6[i];
                max_i=i;
            }
        }
        System.out.println("Индекс минимального элемента - " + min_i + ", Значение минимума -  "+ min);
        System.out.println("Индекс максимального элемента - " + max_i + ", Значение максимума -  "+ max);

        int[] a={1, 2, 3, 4, 5, 6};
        System.out.println(arrayIsSimmetr(a)); //вызов метода из 7-го задания, сам метод ниже


        int[] b;
        b=smechenie(a, 3); //вызов метода из 8-го задания, сам метод ниже
        System.out.println(Arrays.toString(b));

    }

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
       массив типа int длиной len, каждая ячейка которого равна initialValue; */
    public static int[] sozdatMassiv(int len, int initialValue) {
        int[] massiv5=new int[len];
        for (int i=0;i<len; i++) {
            massiv5[i]=initialValue;
        }
        return massiv5;
    }

    /* 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
        вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        **Примеры:
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) ? true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) ? true, т.е. 1 + 1 + 1 = 2 + 1

        граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ. */

    public static boolean arrayIsSimmetr(int[] arr) {
        int sum =0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }

        if (sum%2!=0) return false;
        sum/=2;
        int sum2=0;
        int j=0;
        if (sum>=0) {
            while (sum2<sum) {
                sum2+=arr[j];
                j++;
            }
        }
        else {
            while (sum2>sum) {
                sum2+=arr[j];
                j++;
            }
        }

        if (sum2==sum) return true;
        else return false;

    }

    /* 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
    положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
     [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     При каком n в какую сторону сдвиг можете выбирать сами. */
    public static int[] smechenie(int[] arr, int n) {
        int[] arrNew;
        arrNew=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i < n && n>0) {
                arrNew[i] = arr[arr.length - n + i];
            }
            else if (i >=arr.length+n && n <=0) {
                arrNew[i] = arr[i-arr.length - n];
            }
            else arrNew[i] = arr[i - n];
        }
        return arrNew;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
