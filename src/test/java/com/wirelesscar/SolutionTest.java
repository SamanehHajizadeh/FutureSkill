package com.wirelesscar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SolutionTest {
    private Solution solution ;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void shouldDoNumberOfCowsInCornersWith9CUBE() {
        int N = 3;
        final String[][] CUBE = new String[N][N];
        CUBE[2][2] = "b";
        CUBE[1][1] = "b";
        CUBE[0][0] = "b";

        int result = solution.getNumberOfCowsInCorners();

        assertThat(result, is(2));
    }

    @Test
    public void shouldDoNumberOfCowsInCornersWith16Cube() {
        int N = 4;
        final String[][] CUBE = new String[N][N];
        CUBE[3][3] = "b";
        CUBE[3][0] = "b";
        CUBE[0][0] = "b";
        CUBE[0][3] = "b";

        int result = solution.getNumberOfCowsInCorners();

        assertThat(result, is(4));
    }

    @Test
    public void shouldDoNumberOfCowsWithNeighboursWith9Cube() {
        var n = 3;
        var neighboursCube = new String[n][n];
        neighboursCube[1][2] = "b";
        neighboursCube[2][2] = "b";

        neighboursCube[1][1] = "b";

        int result = solution.getNumberOfCowsWithNeighbours();
        assertThat(result, is(3));

    }

    @Test
    public void shouldDoNumberOfCowsWithNeighboursWith16Cube() {
        var n = 4;
        var neighboursCube = new String[n][n];

        neighboursCube[3][3] = "b";

        neighboursCube[2][3] = "b";

        neighboursCube[1][1] = "b";

        neighboursCube[0][1] = "b";

        neighboursCube[0][0] = "b";

        int result =solution.getNumberOfCowsWithNeighbours();
        assertThat(result, is(5));

    }
}