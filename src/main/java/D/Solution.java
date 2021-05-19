package D;
import java.util.*;

public class Solution implements SolutionInterface {
    private final int n =4;
    private final String[][]  cube = new String[n][n];
     private final String[][]  result = new String[n][n];
     ArrayList arrayList = new ArrayList();

    public Solution() {
        // You can initiate and calculate things here
        // API.getFieldSize()
        // n;
        // API.getNumberOfCowsInCorners
        getNumberOfCowsInCorners();
        // API.getNumberOfCowsWithNeighbours
        getNumberOfCowsWithNeighbours();



    }

    /**
     * Task 1: Return the number of cows hiding in corners.
     */
    public int getNumberOfCowsInCorners() {
        // Write your code here
        // Write your code here
        var countCow = 0;

        if ((cube[0][0] != null)) {
            countCow++;
            arrayList.add(result[0][0]);

        }
        if (cube[0][n - 1] != null) {
            countCow++;
            arrayList.add(result[0][n - 1]);
        }
        if (cube[n - 1][0] != null) {
            countCow++;
            arrayList.add(result[n - 1][0]);
        }
        if (cube[n - 1][n - 1] != null) {
            countCow++;
            arrayList.add(result[n - 1][n - 1]);
        }
        return countCow;
    }

    /**
     * Task 2: Return the number of cows with neighbours.
     */
    public int getNumberOfCowsWithNeighbours() {
        // Write your code here
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
            } else if (hasNeighboursCowRightAndLef(cube, x, y)) {
                countNeighbours++;
            }
        }
        return countNeighbours;
    }

    private static boolean hasNeighboursCowRightAndLef(String[][] cube, int x, int y) {
        return cube[x - 1][y] != null ||
                cube[x][y - 1] != null ||
                cube[x + 1][y] != null ||
                cube[x][y + 1] != null;
    }


    public int getPositionOfCowsInCorners() {
        // Write your code here
        // Write your code here
        var countCow = 0;

        for (int c=0; c<n ; c++) {
            String temp = cube[0][0];
            if (( cube[0][0] != null)) {
                countCow++;
                getXPositionOfCowsInCorners(0);

            }
            if (cube[0][n - 1] != null) {
                countCow++;
                getXPositionOfCowsInCorners(0);
            }
            if (cube[n - 1][0] != null) {
                countCow++;
                getXPositionOfCowsInCorners(n-1);
            }
            if (cube[n - 1][n - 1] != null) {
                countCow++;
                getXPositionOfCowsInCorners(n-1);
            }
        }
return 0;
    }

    public int getXPositionOfCowsInCorners(int x) {

        return x;
    }
}