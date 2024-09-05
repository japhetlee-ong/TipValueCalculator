// Outer class
class Outer {
    
    private val outerProperty: String = "Outer property"

    // Static nested class
    class Nested {
        fun display() {
            println("Static nested class")
        }
    }
}

fun main() {
    // Create an instance of Nested class (static)
    val nested = Outer.Nested()
    
    // Call method on Nested class instance
    nested.display()
}