package edu.citytech.cst.s23370098.dynamicpage;

import com.jbbwebsolutions.helper.FileUtility;
import edu.citytech.cst.s23370098.dynamicpage.businessobject.TicTacToeBO;
import edu.citytech.cst.s23370098.dynamicpage.repository.GradeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T4_ReadingAFile {


    @DisplayName("Test Utility 1")
    @Test
    void T1() {

        String fileName = "/summer2021Development/Students.csv";
        FileUtility.get(fileName).forEach(System.out::println);


        var list = FileUtility.get(fileName);
        var actual = list.size();
        var expected = 141;
        list.forEach(System.out::println);
        assertEquals(expected,actual);

    }


    @DisplayName("Test Utility 2")
    @Test
    void T2() {

        String fileName = "/summer2021Development/Students.csv";

        var list = FileUtility.get(fileName, 1);
        var actual = list.size();
        var expected = 140;
        list.forEach(System.out::println);
        assertEquals(expected,actual);

    }


    @DisplayName("Test Utility 3")
    @Test
    void T3() {

        String fileName = "/summer2021Development/Students.csv";

        var list = FileUtility.get(fileName, 1, GradeRepository::gradeMap);
        var actual = list.size();
        var expected = 140;
        list.forEach(System.out::println);
        assertEquals(expected,actual);

    }
    @DisplayName("Test Utility 4")
    @Test
    void T4() {

        String fileName = "/summer2021Development/Students.csv";

        var list = new GradeRepository().findAll();
        var actual = list.size();
        var expected = 140;
        list.forEach(System.out::println);
        assertEquals(expected,actual);

    }
}
