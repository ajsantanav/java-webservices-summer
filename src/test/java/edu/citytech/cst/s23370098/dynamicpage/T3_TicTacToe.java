package edu.citytech.cst.s23370098.dynamicpage;


import edu.citytech.cst.s23370098.dynamicpage.businessobject.TicTacToeBO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class T3_TicTacToe {

    @DisplayName("Find the winner on line 1 in position (0,1,2)")
    @Test
    void T1() {
        final char moves[] = {'?', '?', '?', '?', 'O', 'O', 'X', 'X', 'X'};
        var gameStatus = TicTacToeBO.isWinner(moves);
        char expected = 'X';
        char actual = gameStatus.getWhoWon();
        assertEquals(expected,actual);

    }

    @DisplayName("Find the winner on line 1 in position (0,1,2)")
    @Test
    void T2() {
        final char moves[] = {'?', '?', '?', '?', 'X', 'X', 'O', 'O', 'O'};
        var gameStatus = TicTacToeBO.isWinner(moves);
        char expected = 'O';
        char actual = gameStatus.getWhoWon();
        assertEquals(expected,actual);

    }

}