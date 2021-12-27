package rules

class SuitRules {

    fun getRules(playerA: String, playerB: String) {

        if (playerA == "rock" && playerB == "rock" ||
            playerA == "paper" && playerB == "paper" ||
            playerA == "scissor" && playerB == "scissor"
        ) {
            println("It’s a draw")
        } else if (playerA == "rock" && playerB == "scissor" ||
            playerA == "paper" && playerB == "rock" ||
            playerA == "scissor" && playerB == "paper"
        ) {
            println("Congrats player A wins")
        } else if (playerA == "scissor" && playerB == "rock" ||
            playerA == "rock" && playerB == "paper" ||
            playerA == "paper" && playerB == "scissor"
        ) {
            println("Congrats player B wins")
        } else {
            println("Your data entered is wrong. Please enter Rock, Scissor or Paper!!")
        }
    }
}