package com.wirelesscar;

import java.util.ArrayList;
import java.util.List;

public class Solution implements SolutionInterface {

    int N =0;
    String[][] cube;


    public Solution() {
        // You can initiate and calculate things here
        N = API.getFieldSize();
        cube = API.getCows();

        getNumberOfCowsInCorners();
        returnIndexOfCowsInCorners();
        getNumberOfCowsWithNeighbours();
    }

    private List<Integer[][]> returnIndexOfCowsInCorners() {
        List<CountAndIndexCowsDto> cows = new ArrayList<>();
        List<Integer[][]> list = new ArrayList<>();


        int result = 0;
        for (var x = 0; x < N; x++) {
            for (var y = 0; y < N; y++) {
                if ((cube[x][y] != null) && ((x == 0 && y == 0) ||
                        (x == 0 && y == N - 1) ||
                        (x == N - 1 && y == 0) ||
                        (x == N - 1 && y == N - 1)
                )
                ) {
                    cows.add(returnJusInCorner(x, y));
                }
            }

        }
        result = cows
                .stream()
                .map(cow -> cow.getCount())
                .reduce(0, Integer::sum);

        Integer integer = cows
                .stream()
                .map(cow -> cow.getX())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(""));


        return list;
    }


    /**
     * Task 1: Return the number of cows hiding in corners.
     */

    public int getNumberOfCowsInCorners() {
        // Write your code here
        List<CountAndIndexCowsDto> cows = new ArrayList<>();

        int count = 0;
        for (var x = 0; x < N; x++) {
            for (var y = 0; y < N; y++) {
                if ((cube[x][y] != null) && ((x == 0 && y == 0) ||
                        (x == 0 && y == N - 1) ||
                        (x == N - 1 && y == 0) ||
                        (x == N - 1 && y == N - 1)
                )
                ) {
                    count++;
                }
            }

        }

        return count;
    }

    private CountAndIndexCowsDto returnJusInCorner(int x, int y) {
        return new CountAndIndexCowsDto(getXInCorners(x), getYInCorners(y), getCount());
    }

    private int getCount() {
        return +1;
    }

    private int getXInCorners(int x) {
        return x;
    }

    private int getYInCorners(int y) {
        return y;
    }

    /**
     * Task 2: Return the number of cows with neighbours.
     */
    public int getNumberOfCowsWithNeighbours() {
        var countNeighbours = 0;
        for (var i = 0; i < N; i++) {
            for (var j = 0; j < N; j++) {
                countNeighbours = countNeighboursCowNext(countNeighbours,N, i, j);
            }
        }
        return countNeighbours;
    }

    private int countNeighboursCowNext(int countNeighbours, int n, int x, int y) {

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
