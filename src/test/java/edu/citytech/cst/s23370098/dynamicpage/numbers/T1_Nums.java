package edu.citytech.cst.s23370098.dynamicpage.numbers;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.AlphabetsBO;
import edu.citytech.cst.s23370098.dynamicpage.businessobject.NumbersBO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_Nums {

    @DisplayName("123 Test")
    @Test
    void T1() {
        int actual = NumbersBO.get123().size();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @DisplayName("123 Test")
    @Test
    void T2() {
        var list = NumbersBO.get123();
        int actual = list.get(0).getNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
