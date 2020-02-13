/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author maindesktop
 */
public class Primos {

    public static void main(String[] args) {
        String matrix[][] = new String[10][10];
        int count = 2;
        int matrixSerial = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = String.valueOf(matrixSerial);
                matrixSerial++;

                count = 2;
                while ((count < Integer.parseInt(matrix[i][j])) && ((Integer.parseInt(matrix[i][j]) % count) != 0)) {
                    count++;
                }
                if (count == Integer.parseInt(matrix[i][j])) {
                    matrix[i][j] = "P" + matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
