package edu.citytech.cst.s23370098.dynamicpage.grading;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.GradingBO;
import edu.citytech.cst.s23370098.dynamicpage.model.GradingPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("test for C")
public class TC_Grading {

    @DisplayName("Test for B+ with 77.7")
    @Test
    void T1() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(77.7f);
        String expected = "C+";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);

    }

    @DisplayName("Test for C with 75.5")
    @Test
    void T2() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(75.5f);
        String expected = "C";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);
    }

    @DisplayName("Not an B test with 92.999")
    @Test
    void T3() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(76.999f);
        String expected = "C+";
        boolean condition = gradingPolicy.getGrade().equals("C+");
        assertFalse( condition);

    }
}
