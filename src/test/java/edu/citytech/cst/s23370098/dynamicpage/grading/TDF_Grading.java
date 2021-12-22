package edu.citytech.cst.s23370098.dynamicpage.grading;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.GradingBO;
import edu.citytech.cst.s23370098.dynamicpage.model.GradingPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TDF_Grading {


    @DisplayName("Test for D with 67.9")
    @Test
    void T1() {

        GradingPolicy gradingPolicy = GradingBO.getGPA(67.9f);
        String expected = "D";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);

    }

    @DisplayName("Not an D test with 59.999")
    @Test
    void T2() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(59.999f);
        String expected = "D";
        boolean condition =  gradingPolicy.getGrade().equals("D");
        assertFalse( condition);

    }


    @DisplayName("Test for F 59.9")
    @Test
    void T3() {

        GradingPolicy gradingPolicy = GradingBO.getGPA(59.9f);
        String expected = "F";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);

    }


}
