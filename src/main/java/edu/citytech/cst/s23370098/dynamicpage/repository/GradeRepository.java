package edu.citytech.cst.s23370098.dynamicpage.repository;

import com.jbbwebsolutions.helper.FileUtility;
import edu.citytech.cst.s23370098.dynamicpage.model.Grades;

import java.util.List;

public class GradeRepository {
    public static Grades gradeMap(String row){
        String columns[] = row.split(",");
        int id = Integer.parseInt(columns[0]);

        float[] scores = getScores(columns);


        return new Grades(id, scores);
    }

    private static float[] getScores(String[] columns) {
        int size = columns.length - 1;
        float scores[] = new float[size];
        for(int i = 0; i<size;i++)
        {
            scores[i] = Float.parseFloat(columns[i+1]);
        }

        return scores;
    }

    public List<Grades> findAll(){
        String fileName = "/summer2021Development/Students.csv";

        var list = FileUtility.get(fileName, 1, GradeRepository::gradeMap);

        return list;
    }
}
