package shape

class Star(private val star: Int) {
    fun printStar() {
        if (star <= 20) {
            for (i in 1..star) {
                for (j in 1..i) {
                    print("*")
                }
                println()
            }
        } else {
            println("max stars you can input 20")
        }
    }
}