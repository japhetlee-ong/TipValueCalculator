// Outer class
class Outer {
    
    private val outerProperty: String = "Outer property"

    // Inner nested class
    inner class Inner {
        fun display() {
            println("Inner class accessing outer property: $outerProperty")
        }
    }
}

fun main() {
    // Create an instance of Outer class
    val outer = Outer()
    
    // Create an instance of Inner class using outer instance
    val inner = outer.Inner()
    
    // Call method on Inner class instance
    inner.display()
}
