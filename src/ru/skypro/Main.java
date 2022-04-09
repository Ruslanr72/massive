package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //ЗАДАЧА 1
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();

        //
        double[] arr2 = {1.57, 7.654, 9.986};

        for (int i = 0; i < arr2.length - 1; i++) {

            System.out.print(arr2[i] + ",");
        }
        System.out.print(arr2[arr2.length - 1]);
        ////Честно, сложно было, в слаке подсмотрел у одногруппника.
        System.out.println();
        //
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        for (int i = 0; i < 12; i++) {
            System.out.print(weights[i] + ",");

        }
        System.out.println();
//Задача 3
        int[] reverce = new int[]{1, 2, 3};
        for (int i = reverce.length - 1; i >= 0; i--) {
            System.out.print(reverce[i] + ",");
        }
        System.out.println();

        //
        double[] reverse2 = {1.57, 7.654, 9.986};
        for (int i = reverse2.length - 1; i >= 0; i--) {
            System.out.print(reverse2[i] + " ");
        }
        System.out.println();

        int[] weights1 = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights1[0] = 90;
        for (int i = weights1.length - 1; i >= 0; i--) {
            System.out.print(weights1[i] + ",");
        }
        System.out.println();
        //Задача 4
        int[] arr3 = new int[]{1, 2, 3};
        for (int y = 0; y < arr3.length; y++) {
            if (arr3[y] % 2 != 0) {
                arr3[y] = arr3[y] + 1;
            } else if (arr3[y] % 2 == 0) {
            }
            System.out.print(arr3[y] + ", ");
        }
    }
}