package edu.citytech.cst.s23370098.dynamicpage.security;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.UserBO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T1_Security {

    @DisplayName("01. Security Test -  with valid password")
    @Test
    @Order(1)
    void T1() {
        boolean condition = new UserBO().isAuthenticated("user-1", "hulk");
        assertTrue(condition);
    }
    @DisplayName("02. Security Test -  with invalid password")
    @Test
    @Order(2)
    void T2() {
        boolean condition = new UserBO().isAuthenticated("user-1", "hulk-smash");
        assertFalse(condition);
    }

    private static UserBO userBO = new UserBO();

    @DisplayName("03. Security Test -  with invalid password and lock the user out")
    @RepeatedTest(3)
    @Order(3)
    void T3() {
        boolean condition = userBO.isAuthenticated("user-1", "hulk-smash");
        assertFalse(condition);
    }

    @DisplayName("04. Security Test -  ")
    @Test
    @Order(4)
    void T4() {
        var userBO = new UserBO();
        var user = userBO.getUserInfo("user-1");
        user.setDisabled(false);
        user.setLoginAttempts(0);
        userBO.updateFile(user);

        assertTrue(true);

    }
}
