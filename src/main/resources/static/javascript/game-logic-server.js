(function(){

    function isWinner(moves, highLightWinner) {

       let allMoves = moves.join("").replaceAll("?","N");
       let url = "/service/tictactoe/" + allMoves;

       //AJAX $.getJSON - jQuery Library
       $.getJSON(url, function(winner){
            console.log("webservice was called");
            console.log(winner);
            highLightWinner(winner);
       });

        console.log({url, moves, date: new Date()});
        //truthy or falsey js
        return {whoWon: "?"} ;

    }

    window.cst4713 = window.cst4713 || {};
    window.cst4713.isWinner = isWinner;
}) ();