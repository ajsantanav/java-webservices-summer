package edu.citytech.cst.s23370098.dynamicpage.model;

public class GradingPolicy {

    private String definition;
    private String grade;
    private float points;

    public GradingPolicy() {
        this.definition = "Below 60";
        this.grade = "F";
        this.points = 0;
    }

    public GradingPolicy(String definition, String grade, float points) {
        this.definition = definition;
        this.grade = grade;
        this.points = points;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "GradingPolicy{" +
                "definition='" + definition + '\'' +
                ", grade='" + grade + '\'' +
                ", points=" + points +
                '}';
    }
}
