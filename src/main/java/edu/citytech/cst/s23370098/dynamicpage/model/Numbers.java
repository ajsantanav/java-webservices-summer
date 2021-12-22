package edu.citytech.cst.s23370098.dynamicpage.model;

public class Numbers {
    private int number;
    private String htmlClass;

    public Numbers(int number, String htmlClass) {
        this.number = number;
        this.htmlClass = htmlClass;
    }

    public Numbers(int number) {
        this.number = number;
        this.htmlClass = "";
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
        return "Numbers{" +
                "number=" + number +
                ", htmlClass='" + htmlClass + '\'' +
                '}';
    }
}
