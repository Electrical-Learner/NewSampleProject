package org.example.array;

public class MultiplicationOfTwoMatrix {
    public static int[][] matrixA = {{1, 2}, {3, 4}, {5, 6}};
    public static int[][] matrixB = {{7, 8}, {9, 10}, {5, 6}};
    public static int sum = 0;

    public static void main(String[] args) {
        if (matrixA.length != matrixB[0].length) {
//            System.out.println("matrix a length is :"+ matrixA.length);
//            System.out.println("matrix b length is :"+ matrixB[0].length);
            System.out.println("Matrix Cannot Be Multiplied");
        } else
            System.out.println("Matrix Can Be Multiplied");
        System.out.println("Resultant Matrix Is: ");
        multiplicationOfTwoMatrix();
    }


    public static void multiplicationOfTwoMatrix() {

        int[][] result = new int[3][3];  //Initialization of output array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sum = sum + matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < 3; i++) {         //output matrix
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        printTheMatrix();
    }

    private static void printTheMatrix() {
        System.out.println("Matrix A is:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(matrixA[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Matrix B  is:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
