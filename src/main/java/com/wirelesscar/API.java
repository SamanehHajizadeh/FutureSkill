package com.wirelesscar;

public class API {
    public static int getFieldSize() {
        return 3;
    }

    public static String[][] getCows() {
        int N = getFieldSize();
        final String[][] CUBE = new String[N][N];
        CUBE[2][2] = "b";
        CUBE[1][1] = "b";
        CUBE[0][0] = "b";

        return CUBE;
    }


}
