package edu.citytech.cst.s23370098.dynamicpage.abc;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.AlphabetsBO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ABC Test")
public class T1_ABC {

    @DisplayName("ABC Size Test")
    @Test
    void T1() {
        int actual = AlphabetsBO.getABC().size();
        int expected = 26;
        assertEquals(expected, actual);
    }

    @DisplayName("ABC Size Test")
    @Test
    void T2() {
        var list = AlphabetsBO.getABC();
        list.forEach(System.out::println);
        char actual = list.get(25).getLetter();
        char expected = 'Z';
        assertEquals(expected, actual);
    }

    @DisplayName("ABC Size Test")
    @Test
    void T3() {
        char letter = 'a';
        boolean actual = AlphabetsBO.isVowel(letter);
        boolean expected = true;
        assertEquals(expected, actual);
    }


}
