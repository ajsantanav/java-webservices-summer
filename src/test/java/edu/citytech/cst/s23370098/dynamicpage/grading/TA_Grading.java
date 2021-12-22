package edu.citytech.cst.s23370098.dynamicpage.grading;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.GradingBO;
import edu.citytech.cst.s23370098.dynamicpage.businessobject.TicTacToeBO;
import edu.citytech.cst.s23370098.dynamicpage.model.GradingPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("test for A and 4.0")
public class TA_Grading {


    @DisplayName("Test for A with 93")
    @Test
    void T1() {

        GradingPolicy gradingPolicy = GradingBO.getGPA(93f);
        String expected = "A";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);

    }

    @DisplayName("Test for A with 96")
    @Test
    void T2() {
        GradingPolicy gradingPolicy = GradingBO.getGPA(96f);
        String expected = "A";
        String actual = gradingPolicy.getGrade();
        assertEquals(expected,actual);

    }

    @DisplayName("Not an A test with 92.999")
    @Test
    void T3() {

        GradingPolicy gradingPolicy = GradingBO.getGPA(92.999f);


        String expected = "A";
        boolean condition =  gradingPolicy.getGrade().equals("A");
        assertFalse( condition);

    }


}
