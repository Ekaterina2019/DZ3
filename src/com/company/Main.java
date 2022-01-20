package com.company;


import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

// replacingNumbersInAnArray();
// arrayFiling();
// multiplicationOfNumbersInAnArray();
// diagonalInArray();
// System.out.print(returnArray(5,1));
// searchMinAndMaxValueInArray();

    }
    //Task_01
    public static void replacingNumbersInAnArray() {

        int[] intArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 1) {
                intArr[i] = 0;
            } else {
                intArr[i] = 1;
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }

    }
    //Task_02
    public static void arrayFiling() {

        int[] intArr = new int[100];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }
    }
    //Task_03
    public static void multiplicationOfNumbersInAnArray() {

        int[] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < 6) {
                intArr[i] = intArr[i] * 2;
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }

    }
    //Task_04
    public static void diagonalInArray(){

        int [][] intArrDiagonal = new int[6][6];

        for (int i = 0; i < intArrDiagonal.length; i++) {
            intArrDiagonal[i][(intArrDiagonal[i].length - 1) - i] = 1;
            for (int j = 0; j < intArrDiagonal[i].length; j++) {
                if (i == j) {
                    intArrDiagonal[i][j] = 1;
                }
                System.out.print(intArrDiagonal[i][j] + "\t");
            }
            System.out.println();
        }

    }
    //Task_05
    public static int[] returnArray(int len, int initialValue){

        int[] intArr = new int[len];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = initialValue;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }
        System.out.println();
        return intArr;


    }
    //Task_06
    public static void searchMinAndMaxValueInArray () {

        int[] intArr = new int[6];
        int min = 0;
        int max = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt(50);
            System.out.print(intArr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < intArr.length; i++) {
            if (i == 0) {
                min = intArr[i];
                max = intArr[i];
            }else if (intArr[i] > max) {
                max = intArr[i];
            }else{
                min = intArr[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
    }

}
