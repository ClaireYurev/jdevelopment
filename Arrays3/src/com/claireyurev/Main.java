package com.claireyurev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// 2D Arrays

        int[][] numbers = new int[2][3]; // "2 by 3" or 2 rows, 3 columns
        numbers[0][0] = 1;

        int[][][] cube = new int[2][3][5]; // "2 by 3" or 2 rows, 3 columns
        cube[0][0][0] = 1;

        System.out.println(Arrays.deepToString(numbers));
        System.out.println("________");
        System.out.println(Arrays.deepToString(cube));

    }
}
