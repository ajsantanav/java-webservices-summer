package edu.citytech.cst.s23370098.dynamicpage.model;

public class GameStatus {
    final public int p1;
    final public int p2;
    final public int p3;

    private char whoWon;

    public GameStatus(int[] moves) {
        this.p1 = moves[0];
        this.p2 = moves[1];
        this.p3 = moves[2];
    }

    public GameStatus() {
       this.p1 = 0;
       this.p2 = 0;
       this.p3 = 0;
       this.whoWon = '?';
    }


    public char getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(char whoWon) {
        this.whoWon = whoWon;
    }

    @Override
    public String toString() {
        return "WhoWon{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", whoWon='" + whoWon + '\'' +
                '}';
    }
}
