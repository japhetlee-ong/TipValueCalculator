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
        println("$name barks loudly!")
    }
}

fun main() {
    // Create an instance of Animal and call makeNoise
    val animal = Animal("Generic Animal")
    animal.makeNoise()

    // Create an instance of Dog (subclass) and call makeNoise
    val dog = Dog("Buddy")
    dog.makeNoise()
}