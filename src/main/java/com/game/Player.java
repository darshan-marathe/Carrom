package com.game;

public class Player {
    int no;
    int point;
    int fouls;
    int noneCount;

    public Player(int no, int point) {
        this.no = no;
        this.point = point;
    }

    public int getNoneCount() {
        return noneCount;
    }

    public void setNoneCount(int noneCount) {
        this.noneCount = noneCount;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
