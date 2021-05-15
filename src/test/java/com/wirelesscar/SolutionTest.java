package com.wirelesscar;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SolutionTest {

    @Test
    public void shouldDoNumberOfCowsInCornersWith9Cube() {
        var n = 3;
        var cube = new String[n][n];
        cube[2][2] = "b";
        cube[1][1] = "b";
        cube[0][0] = "b";

        int result = Solution.getNumberOfCowsInCorners(cube, n);

        assertThat(result, is(2));
    }
    @Test
    public void shouldDoNumberOfCowsInCornersWith16Cube() {
        var n = 4;
        var cube = new String[n][n];
        cube[3][3] = "b";
        cube[3][0] = "b";
        cube[0][0] = "b";
        cube[0][3] = "b";

        int result = Solution.getNumberOfCowsInCorners(cube, n);

        assertThat(result, is(4));
    }

    @Test
    public void shouldDoNumberOfCowsWithNeighboursWith9Cube() {
        var n = 3;
        var neighboursCube = new String[n][n];
        neighboursCube[1][2] = "b";
        neighboursCube[2][2] = "b";

        neighboursCube[1][1] = "b";

        int result = Solution.getNumberOfCowsWithNeighbours(neighboursCube, n);
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

        int result = Solution.getNumberOfCowsWithNeighbours(neighboursCube, n);
        assertThat(result, is(5));

    }
}