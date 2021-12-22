package edu.citytech.cst.s23370098.dynamicpage.model;

public class ABC {
    private char letter;
    private int number;
    private String htmlClass;

    public ABC() {
    }

    public ABC(char letter, int number, String htmlClass) {
        this.letter = letter;
        this.number = number;
        this.htmlClass = htmlClass;
    }

    public ABC(char letter, int number) {
        this.letter = letter;
        this.number = number;
        this.htmlClass = "";
    }


    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHtmlClass() {
        return htmlClass;
    }

    public void setHtmlClass(String htmlClass) {
        this.htmlClass = htmlClass;
    }

    @Override
    public String toString() {
        return "ABC{" +
                "letter=" + letter +
                ", number=" + number +
                ", htmlClass='" + htmlClass + '\'' +
                '}';
    }
}
