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
        var countNeighbours = 0;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                countNeighbours = countNeighboursCowNext(cube, countNeighbours, n, i, j);
            }
        }
        return countNeighbours;
    }

    public static int countNeighboursCowNext(String[][] cube, int countNeighbours, int n, int x, int y) {

        String temp = cube[x][y];
        if (temp != null) {
            if ((x == n - 1) && (y == n - 1)) {
                if (cube[x][y] != null) countNeighbours++;
            } else if ((x == 0) && (y == 0)) {
                if (cube[x + 1][y] != null) countNeighbours++;
                if (cube[x][y + 1] != null) countNeighbours++;
            } else if (x == n - 1) {
                if (cube[x][y + 1] != null) countNeighbours++;
            } else if (y == n - 1) {
                if (cube[x + 1][y] != null) countNeighbours++;
            } else if (x == 0) {
                if (cube[x][y - 1] != null) countNeighbours++;
            } else if (y == 0) {
                if (cube[x - 1][y] != null) countNeighbours++;
            } else {
                if (cube[x - 1][y] != null) countNeighbours++;
                if (cube[x][y - 1] != null) countNeighbours++;
                if (cube[x + 1][y] != null) countNeighbours++;
                if (cube[x][y + 1] != null) countNeighbours++;
            }
        }
        return countNeighbours;
    }

}
