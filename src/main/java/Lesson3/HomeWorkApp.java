package Lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        /* 1. ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         � ������� ����� � ������� �������� 0 �� 1, 1 �� 0; */

        int[] massiv1={1,1,0,0,1,0,1,1,0};
        for (int i=0; i< massiv1.length; i++){
            if (massiv1[i]==0) {
                massiv1[i]=1;
            }
            else  massiv1[i]=0;
        }
        System.out.println(Arrays.toString(massiv1));

        /* 2. ������ ������ ������������� ������ ������ 100. � ������� ����� ��������� ��� ����������
        1 2 3 4 5 6 7 8 � 100;*/

        int[] massivSotka=new int[100];
        for (int i=0; i<100; i++){
            massivSotka[i]=i+1;
        }
        System.out.println(Arrays.toString(massivSotka));

        /* 3. ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������, � ����� ������� 6
        �������� �� 2; */

        int[] massiv3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< massiv3.length; i++){
            if (massiv3[i]<6) {
                massiv3[i]*=2;
            }
        }
        System.out.println(Arrays.toString(massiv3));

        /* 4. ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������), � �
        ������� �����(-��) ��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ����
        ��� ������). ���������� �������� ����� �� ���������� ����� �� ���������� ��������: ������� ����� ���������
         �����, �� ���� [0][0], [1][1], [2][2], �, [n][n]; */

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

        int[] arr5=sozdatMassiv(3,5); //����� ������ �� 5-�� �������, ��� ����� ����
        System.out.println(Arrays.toString(arr5));

        /* 6. * ������ ���������� ������ � ����� � ��� ����������� � ������������ �������� ; */

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
        System.out.println("������ ������������ �������� - " + min_i + ", �������� �������� -  "+ min);
        System.out.println("������ ������������� �������� - " + max_i + ", �������� ��������� -  "+ max);

        int[] a={1, 2, 3, 4, 5, 6};
        System.out.println(arrayIsSimmetr(a)); //����� ������ �� 7-�� �������, ��� ����� ����


        int[] b;
        b=smechenie(a, 3); //����� ������ �� 8-�� �������, ��� ����� ����
        System.out.println(Arrays.toString(b));

    }

    /* 5. �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������ ����������
       ������ ���� int ������ len, ������ ������ �������� ����� initialValue; */
    public static int[] sozdatMassiv(int len, int initialValue) {
        int[] massiv5=new int[len];
        for (int i=0;i<len; i++) {
            massiv5[i]=initialValue;
        }
        return massiv5;
    }

    /* 7. ** �������� �����, � ������� ���������� �� ������ ���������� ������������� ������, ����� ������
        ������� true, ���� � ������� ���� �����, � ������� ����� ����� � ������ ����� ������� �����.
        **�������:
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) ? true, �.�. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) ? true, �.�. 1 + 1 + 1 = 2 + 1

        ������� �������� ��������� |||, ��� ������� � ������ �� ������ � �� ����� �������� ��������� � ���. */

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

    /* 8. *** �������� �����, �������� �� ���� �������� ���������� ������ � ����� n (����� ����
    �������������, ��� �������������), ��� ���� ����� ������ �������� ��� �������� ������� �� n �������.
    �������� ��������� ��������. ��� ���������� ������ ������ ������������ ���������������� ���������.
    �������: [ 1, 2, 3 ] ��� n = 1 (�� ���� ������) -> [ 3, 1, 2 ];
     [ 3, 5, 6, 1] ��� n = -2 (�� ��� �����) -> [ 6, 1, 3, 5 ].
     ��� ����� n � ����� ������� ����� ������ �������� ����. */
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
