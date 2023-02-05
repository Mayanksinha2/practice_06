package com.internshala;

public class practice_06 {
    public static void main(String[] args) {
        double[] arr = {2.345,4.567,6.432,9.543};
        double sum = 0;
    // Using of for each loop in java.
        for (double i:arr) {
            sum += i;
        }
        System.out.println(sum);


        // 2D array is basically the collection of all 1D arrays.
        int sum2 = 0;
        int [][] array2D = {
                          {4,5,7,2},
                          {5,9,5,1},
                          {4,6,2,8},
                          {5,8,7,6}
                           };

        for (int row = 0; row<array2D.length; row++){
            for (int column = 0; column<array2D.length; column++){
                sum2 += array2D[row][column];
                System.out.print(array2D[row][column] + " "); // Here we have used + symbol for addition all in one line
            }
            System.out.println(); // This will simply break lines and make array look like as initialized.
        }
        System.out.println("The sum is " + sum2);

    }
}
