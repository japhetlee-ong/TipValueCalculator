// Define a class with methods demonstrating compile-time polymorphism
class MathOperations {

    // Method to add two integers
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Method to add three integers
    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    // Method to add two doubles
    fun add(a: Double, b: Double): Double {
        return a + b
    }
}

fun main() {
    val math = MathOperations()

    // Call each overloaded method
    println("Sum of 5 and 10: " + math.add(5, 10))
    println("Sum of 5, 10, and 15: " + math.add(5, 10, 15))
    println("Sum of 3.5 and 2.5: " + math.add(3.5, 2.5))
}