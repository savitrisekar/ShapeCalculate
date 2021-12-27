import java.lang.NumberFormatException
import kotlin.system.exitProcess

class SuitGame {

    private var playerA: String = ""
    private var playerB: String = ""

    fun run() {
        printHeader()
        inputMenu()
    }

    private fun printHeader() {

        println(
            """
    ===========================
    GAME SUIT TERMINAL VERSION
    ===========================
    1. PLAY GAME
    2. EXIT
    ===========================
    Choose your menu : (1/2)
    ===========================
""".trimIndent()
        )
    }

    private fun inputMenu() {
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenu(it: String) {

        when (it) {
            "1" -> {
                playGame()
            }
            "2" -> {
                println("Bye bye")
                exitProcess(0)
            }
        }
    }

    private fun playGame() {
        println(
            """
            ============================
            Enter rock, scissor or paper
            ============================
        """.trimIndent()
        )
        println("Player A Choose : ")
        playerA = getValueFromUser()
        println("Player B Choose : ")
        playerB = getValueFromUser()
        println("============================")
        println("Result : ")
        gameResult()
    }

    private fun getValueFromUser(): String {
        return try {
            readLine().toString()
        } catch (e: NumberFormatException) {
            ""
        }
    }

    private fun gameResult() {
        val result = SuitRules()
        result.getRules(playerA, playerB)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SuitGame().run()
        }
    }
}