package shape

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) : Shape("Triangle") {
    override fun calculateArea(): Double {
        return (sideA * sideB) / 2
    }

    override fun calculateCircular(): Double {
        return sideA + sideB + sideC
    }
}