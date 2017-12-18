package cwiczenia411;

import java.util.Random;

public class TwoDimensionalArray {
    private int length;
    private int height;
    private int[][] array;

    TwoDimensionalArray(int length, int height) {
        this.length = length;
        this.height = height;
        array = new int[length][height];
    }

    void show() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void fillArray(int min, int max) {
        Random random = new Random();
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < height; column++) {
                array[row][column] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    void showRow(int r) {
        for (int column = 0; column < height; column++) {
            System.out.print(array[r][column] + "\t");
        }
        System.out.println();
    }

    void showColumn(int c) {
        for (int row = 0; row < length; row++) {
            System.out.print(array[row][c] + "\t");
        }
        System.out.println();
    }

    void sumRowCol() {
        int[] temp = new int[height];
        for (int row = 0; row < length; row++) {
            int sum = 0;
            for (int column = 0; column < height; column++) {
                System.out.print(array[row][column] + "\t");
                sum += array[row][column];
                temp[column] += array[row][column];
            }
            System.out.println("| \t" + sum);
        }
        for (int column = 0; column < height + 1; column++) {
            if (column == height) {
                System.out.print("+\t");
            } else {
                System.out.print("--\t");
            }
        }
        System.out.println();

        int sum = 0;
        for (int column = 0; column < height; column++) {
            System.out.print(temp[column] + "\t");
            sum += temp[column];
        }
        System.out.println("|\t" + sum);

    }

    void removeRow(int r) {
        int z = 0;
        int[][] array2 = new int[array.length - 1][height];
        System.arraycopy(array, 0, array2, 0, z);
        System.arraycopy(array, z + 1, array2, z, array.length - z - 1);
        array = array2;
        System.out.println(array2[length][height]
        );
    }

    void changeRows() {
        for (int row = 0; row < length; row++) {
            int[] temp = array[row];
            array[row] = array[row + 1];
            array[row + 1] = temp;

        }
        System.out.println(array[length][height]);
    }

    void minMax() {
        int max = array[0][0];
        // int min=array[0][0];
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < height; j++) {

                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);


    }

    void min() {
        int min = array[0][0];

        for (int i = 1; i < length; i++) {
            for (int j = 1; j < height; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
    }
    void changeUp(){

        for(int i=0;i<length;i++){
            for(int j=0;j<height/2;j++){

                int temp=array[i][j];
                temp=array[i][height - i-1];
                array[i][height-i-1]=temp;

            }
        }show();

    }
}