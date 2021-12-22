package edu.citytech.cst.s23370098.dynamicpage.grading;


import edu.citytech.cst.s23370098.dynamicpage.businessobject.GradingBO;
import edu.citytech.cst.s23370098.dynamicpage.model.GradingPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("test for B+ and 3.3")

public class TB_Grading {


    @DisplayName("Test for B with ")
    @Test
    void T1() {

        GradingPolicy gradingPolicy = GradingBO.getGPA(87.0f);
        String expected = "B+";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);

    }

    @DisplayName("Test for B with 83.06")
    @Test
    void T2() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(83.06f);
        String expected = "B";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);
    }

    @DisplayName("Test for B- with 81.0")
    @Test
    void T3() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(81.0f);
        String expected = "B-";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);
    }

    @DisplayName("Not an B test with 92.999")
    @Test
    void T4() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(86.999f);
        String expected = "B+";
        boolean condition = gradingPolicy.getGrade().equals("B+");
        assertFalse( condition);

    }
}