package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import edu.citytech.cst.s23370098.dynamicpage.model.GameStatus;


import Java.util.Arrays;
import java.util.function.Predicate;

public class TicTacToeBO {

    static final int[][] winningMoves = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},

        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},

        {0, 4, 8},
        {2, 4, 6},
    };


    public static GameStatus isWinner(char[] moves) {

        Predicate<GameStatus> predicate = e -> {
            var status = moves[e.p1] == moves[e.p2]
                    && moves[e.p2] == moves [e.p3]
                    && moves[e.p2] != '?';

            return status;
        };

        var gs = Arrays.stream(winningMoves)
                                .map(GameStatus::new)
                                .filter(predicate)
                .findFirst();

                    if(gs.isPresent())
                    {
                        var status = gs.get();
                        status.setWhoWon(moves[status.p1]);
                        return gs.get();
                    }

        return new GameStatus(new int[]{});
    }
}
