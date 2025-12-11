package Arrayss;

import java.util.Scanner;

public class MultiDimentionalArrays {

    public static void PrintTwoDimArray(int[][] arr){
        //int[][] arr = {{74, 78, 75, 20}, {23, 11, 77, 41}, {57, 34, 78, 96}};

        for (int[] array: arr){
            for (int num: array)
                System.out.print(num + " ");
            System.out.println();
        }
    }

    public static void twoDimArrWithUserInput(){
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int[] array: arr)
            for (int i = 0; i < array.length; i++){
                System.out.print("Enter elements of array:");
                array[i] = sc.nextInt();
            }

        PrintTwoDimArray(arr);
    }

    public static void threeDimArray(){
        int[][][] arr = {{{11, 12}, {75, 76}}, {{33, 34}, {47, 48}}};

        for (int[][] arr3: arr) {
            PrintTwoDimArray(arr3);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] arr;
        arr = new int[1][3];
        arr[0][0] = 1;
        arr[0][1] = 7;
        arr[0][2] = 12;
       // twoDimArrWithUserInput();

        threeDimArray();
    }
}
