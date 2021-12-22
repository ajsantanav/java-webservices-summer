package edu.citytech.cst.s23370098.dynamicpage;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.GradingBO;
import edu.citytech.cst.s23370098.dynamicpage.repository.GradeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T5_GradingBO {

    @DisplayName("Test Utility 4")
    @Test
    void T1() {

        String fileName = "/summer2021Development/Students.csv";

        var list = new GradingBO().findGrades();
        var actual = list.size();
        var expected = 140;
        list.forEach(System.out::println);
        assertEquals(expected,actual);

    }


    @DisplayName("A test")
    @Test
    void T2() {

        String fileName = "/summer2021Development/Students.csv";

        var list = new GradingBO().findGrades("A");
        var actual = list.size();
        var expected = 16;
        list.forEach(System.out::println);
        assertEquals(expected,actual);

    }
}
