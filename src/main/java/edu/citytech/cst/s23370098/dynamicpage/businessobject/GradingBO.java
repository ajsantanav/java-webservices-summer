package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import edu.citytech.cst.s23370098.dynamicpage.model.Grades;
import edu.citytech.cst.s23370098.dynamicpage.model.GradingPolicy;
import edu.citytech.cst.s23370098.dynamicpage.repository.GradeRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GradingBO {
    public static GradingPolicy getGPA(float score) {
        var gradingPolicy = new GradingPolicy();

        if(score >= 93.0) {
            gradingPolicy = new GradingPolicy("93-100%", "A", 4.0f);
        }
        else if(score >= 90f) {
            gradingPolicy = new GradingPolicy("90-92.29%", "A-", 3.7f);
        }
        else if(score >= 87.0 && score < 90.0) {
            gradingPolicy = new GradingPolicy("87-89.9%", "B+", 3.3f);
        }
        else if(score >= 83.0) {
            gradingPolicy = new GradingPolicy("83-86.9%", "B", 3.0f);
        }
        else if(score >= 80.0) {
            gradingPolicy = new GradingPolicy("80-82.9%", "B-", 2.7f);
        }
        else if(score >= 77.0) {
            gradingPolicy = new GradingPolicy("77-79.9%", "C+", 2.3f);
        }
        else if(score >= 75.0) {
            gradingPolicy = new GradingPolicy("75-76.9%", "C", 2.0f);
        }
        else if(score >= 60.0) {
            gradingPolicy = new GradingPolicy("60-74.9%", "D", 1.0f);
        }
        else if(score < 60.0) {
            gradingPolicy = new GradingPolicy("Below 60", "F", 0.0f);
        }


        return gradingPolicy;
    }
    private static Grades mapToGrade(Grades grades) {

        float[] scores = grades.getScores();

        var total = 0f;
        for (var score: scores ) {
            total = total + score;
        }

        var average = total / scores.length;
        var gradingPolicy = getGPA(average);


        grades.setLetterGrade(gradingPolicy.getGrade());
        grades.setAverageGrade(average);
        grades.setGpa(gradingPolicy.getPoints());

        return grades;
    }

    public List<Grades> findGrades(String... grades) {
        var list = new GradeRepository().findAll();

        Predicate<Grades> predicate = e -> true;

        if(grades.length > 0 && !grades[0].equalsIgnoreCase("All"))
        {
            predicate = e -> e.getLetterGrade().equals(grades[0]);
        }

        var modifiedList = list.stream().map(GradingBO::mapToGrade)
                .filter(predicate)
                .collect(Collectors.toList());

        return modifiedList;
    }
}
