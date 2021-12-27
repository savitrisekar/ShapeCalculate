package players

import java.lang.NumberFormatException

class PlayerB : Players("player.PlayerB") {
    override fun getValueFromUser(): String {
        return try {
            readLine()?.lowercase() ?: ""
        } catch (e: NumberFormatException) {
            ""
        }
    }
}