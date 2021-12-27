package players

abstract class Players(private val playerName: String) {
    fun printPlayer() {
        println("$playerName choose :")
    }

    abstract fun getValueFromUser() : String
}