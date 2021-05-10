package com.wirelesscar;

public class Solution {

    /**
     * Task 1: Return the number of cows hiding in corners.
     */
    public static int getNumberOfCowsInCorners(String[][] cube, int n) {
        // Write your code here
        var countCow = 0;

        if ((cube[0][0] != null)) {
            countCow++;
        }
        if (cube[0][n - 1] != null) {
            countCow++;
        }
        if (cube[n - 1][0] != null) {
            countCow++;
        }
        if (cube[n - 1][n - 1] != null) {
            countCow++;
        }
        return countCow;
    }

    /**
     * Task 2: Return the number of cows with neighbours.
     */
    public static int getNumberOfCowsWithNeighbours(String[][] cube, int n) {
        var result = 0;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                result += countNeighboursCow(cube, n, i, j);
            }
        }
        return result*2;
    }

    public static int countNeighboursCow(String[][] cube, int n, int i, int j) {
        var countNeighbours = 0;
        String temp = cube[i][j];
        if (temp != null) {
            if (i == n - 1) {
                if (cube[i][j + 1] != null) countNeighbours++;
            } else if (j == n - 1) {
                if (cube[i + 1][j] != null) countNeighbours++;
            } else {
                if (cube[i + 1][j] != null) countNeighbours++;
                if (cube[i][j + 1] != null) countNeighbours++;
            }
        }
        return countNeighbours;
    }
}
