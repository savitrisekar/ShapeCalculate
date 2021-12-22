package shape

class Star(private val row: Int) {
    fun printStar() {
        for (i in 1..row) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}