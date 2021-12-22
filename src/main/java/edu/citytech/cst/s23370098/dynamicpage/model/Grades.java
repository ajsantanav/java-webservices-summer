package edu.citytech.cst.s23370098.dynamicpage.model;

import java.util.Arrays;

public class Grades {

    private int id;
    private float[] scores;

    private String letterGrade;
    private float gpa;
    private float averageGrade;


    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Grades() {

    }

    public Grades(int id, float[] scores) {
        this.id = id;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float[] getScores() {
        return scores;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "id=" + id +
                ", scores=" + Arrays.toString(scores) +
                ", letterGrade='" + letterGrade + '\'' +
                ", gpa=" + gpa +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
