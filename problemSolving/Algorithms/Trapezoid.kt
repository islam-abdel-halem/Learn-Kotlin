package problemSolving.Algorithms

class Trapezoid(
    private val base1: Double,
    private val base2: Double,
    private val heigth: Double,
    ) {

    fun calculateArea():Double{
        return ((base1 + base2) / 2.0 ) * heigth
    }


    fun getBase1():Double = base1
    fun getBase2():Double = base2
    fun getHeigth():Double = heigth

    override fun toString(): String {
        return "Trapezoid(base1=$base1, base2=$base2, heigth=$heigth, area=${calculateArea()})"
    }

    companion object {
        fun fromInt(base1:Int, base2:Int, heigth:Int):Trapezoid{
            return Trapezoid(base1.toDouble(),base2.toDouble(),heigth.toDouble())
        }

        fun isValid(base1: Double, base2: Double, height: Double): Boolean {
            return base1 > 0 && base2 > 0 && height > 0
        }
    }

    init {
        require(isValid(base1, base2, heigth)) {
            "Invalid trapezoid dimensions. All values must be greater than 0"
        }
    }

}

fun main() {
    // Create a trapezoid with double values
    val trapezoid1 = Trapezoid(6.0, 4.0, 3.0)
    println("Area of trapezoid1: ${trapezoid1.calculateArea()}")  // Output: 15.0

    // Create a trapezoid with integers using companion object
    val trapezoid2 = Trapezoid.fromInt(8, 6, 4)
    println("Area of trapezoid2: ${trapezoid2.calculateArea()}")  // Output: 28.0

    // Print full trapezoid information
    println(trapezoid1.toString())

    try {
        // This will throw an IllegalArgumentException
        val invalidTrapezoid = Trapezoid(-1.0, 4.0, 3.0)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}