import shape.Circle
import shape.Rectangle
import shape.Star
import shape.Triangle
import java.lang.NumberFormatException
import kotlin.math.roundToInt

class App {

    fun run() {
        printHeader()
        inputMenu()
    }

    private fun printHeader() {

        println(
            """
                ================================
                Calculate are in 2D
                ================================
                1. Rectangle area
                2. Circle area
                3. Triangle area
                4. Print Star
                ================================
                enter your choice : (1/2/3/4)
                ================================
            """.trimIndent()
        )
    }

    private fun inputMenu() {
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                openRectangle()
            }
            "2" -> {
                openCircular()
            }
            "3" -> {
                openTriangle()
            }
            "4" -> {
                openStar()
            }

            else -> {
                println("No menu")
                run()
            }
        }
    }

    private fun openRectangle() {
        println("Enter length : ")
        val length = getValueFromUser()
        println("Enter width : ")
        val width = getValueFromUser()

        val rectangle = Rectangle(length, width)
        rectangle.printShapeName()
        rectangle.printTotalAreaAndCircular()
    }

    private fun openTriangle() {
        println("Enter baseA : ")
        val baseA = getValueFromUser()
        println("Enter baseB : ")
        val baseB = getValueFromUser()
        println("Enter baseC : ")
        val baseC = getValueFromUser()

        val triangle = Triangle(baseA, baseB, baseC)
        triangle.printShapeName()
        triangle.printTotalAreaAndCircular()
    }

    private fun openCircular() {
        println("Enter radius : ")
        val radius = getValueFromUser()

        val circular = Circle(radius)
        circular.printShapeName()
        circular.printTotalAreaAndCircular()
    }

    private fun openStar() {
        println("Enter total star (max stars : 20) : ")
        val row = getValueFromUser()

        val star = Star(row.roundToInt())
        star.printStar()
    }

    private fun getValueFromUser(): Double {
        return try {
            readLine()?.toDouble() ?: 0.0
        } catch (e: NumberFormatException) {
            0.0
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}