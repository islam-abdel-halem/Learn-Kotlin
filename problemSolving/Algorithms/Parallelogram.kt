package problemSolving.Algorithms


class Parallelogram(
    private val base: Double,
    private val heigth: Double,
    ) {

    fun calculateArea():Double{
        return base * heigth
    }

    fun getBase():Double = base
    fun getHeigth():Double = heigth

    override fun toString(): String {
        return "Parallelogram(base=$base, heigth=$heigth, area=${calculateArea()})"
    }

    companion object {
        fun fromInt(base:Int, heigth:Int):Parallelogram{
            return Parallelogram(base.toDouble(),heigth.toDouble())
        }
    }

}

fun main() {
    // Create a parallelogram with double values
    val parallelogram1 = Parallelogram(5.0, 3.0)
    println("Area of parallelogram1: ${parallelogram1.calculateArea()}")  // Output: 15.0

    // Create a parallelogram with integers using companion object
    val parallelogram2 = Parallelogram.fromInt(6, 4)
    println("Area of parallelogram2: ${parallelogram2.calculateArea()}")  // Output: 24.0

    // Print full parallelogram information
    println(parallelogram1.toString())
}