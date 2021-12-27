package players

import java.lang.NumberFormatException

class PlayerA : Players("player.PlayerA") {
    override fun getValueFromUser(): String {
        return try {
            readLine()?.lowercase() ?: ""
        } catch (e: NumberFormatException) {
            ""
        }
    }
}