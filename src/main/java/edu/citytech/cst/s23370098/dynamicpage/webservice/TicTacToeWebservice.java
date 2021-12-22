package edu.citytech.cst.s23370098.dynamicpage.webservice;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.TicTacToeBO;
import edu.citytech.cst.s23370098.dynamicpage.model.GameStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicTacToeWebservice {


        //local host:8080/service/tictactoe/XXX???XOX
        @RequestMapping(value = "/service/tictactoe/{moves}")
        public GameStatus getStatus(@PathVariable String moves) {
            System.out.println(moves);
            var gameStatus = TicTacToeBO.isWinner(moves.toCharArray());
            return gameStatus;
        }
}
