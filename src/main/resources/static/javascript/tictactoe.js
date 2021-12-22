    "use strict";
(function() {

        let isX = true;
        let isWinner = false;

        const message = $("#message");

        const highLightWinner = function(winner){

            /*
            winner --> e.p1 e.p2 e.p3
            */


            if(winner.whoWon == "X" || winner.whoWon == "O"){

            let div1 = $(".small-box")[winner.p1];
            let div2 = $(".small-box")[winner.p2];
            let div3 = $(".small-box")[winner.p3];


            $(div1).addClass("winner");
            $(div2).addClass("winner");
            $(div3).addClass("winner");

             isWinner = true;
             message.text("Winner was found: " + winner.whoWon);

             }
        };

        $(".small-box").click( function() {
            message.text("");

            let value = $(this).text();
            if(value != "?")
            {
                let lMessage = "Cheating!!!!";
                $("#message").text(lMessage);
                return;
            }

            let xOrO = isX ? "X" : "O";
            $(this).text(xOrO);
            isX = !isX;

            let moves = $(".small-box").text().split("");

            /*check to see if winner was found */

            let whichFunction = window.cst4713.isWinner || window.cst4713.isWinnerForServer;
            let winner = window.cst4713.isWinner(moves, highLightWinner);
//            let size = Object.values(winner).length;


        });


       $("#btn-clear").click( () => {

            $(".small-box").text("?");
            $("#message").text("");
            isWinner = false;
            $(".small-box").removeClass("winner");
        });


}) ();
