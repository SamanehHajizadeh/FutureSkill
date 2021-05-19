package com.wirelesscar;

public class CountAndIndexCowsDto {
    private int id;
    private int x;
    private int y;
    private int count;

    public CountAndIndexCowsDto() {
    }

    public CountAndIndexCowsDto(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
