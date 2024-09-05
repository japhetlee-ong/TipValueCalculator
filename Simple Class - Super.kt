// Define an open class Animal
open class Animal(val name: String) {

    // Open function to make noise
    open fun makeNoise() {
        println("$name makes a noise.")
    }
}

// Inherit from Animal to create a subclass
class Dog(name: String) : Animal(name) {

    // Override the makeNoise function
    override fun makeNoise() {
        super.makeNoise() // Calling the superclass function
        println("$name barks loudly!")
    }
}

fun main() {
    // Create an instance of Dog (subclass) and call makeNoise
    val dog = Dog("Buddy")
    dog.makeNoise()
}