// Parent class (superclass)
open class Animal(val name: String, val age: Int) {

    // Function to make a noise (can be overridden)
    open fun makeNoise() {
        println("$name makes a noise.")
    }

    // Function to display details
    fun displayDetails() {
        println("$name is $age years old.")
    }
}

// Child class (subclass) inheriting from Animal
class Dog(name: String, age: Int) : Animal(name, age) {

    // Override function to make a noise
    override fun makeNoise() {
        println("$name barks loudly!")
    }

    // Additional function specific to Dog
    fun fetch() {
        println("$name is fetching the ball.")
    }
}

fun main() {
    // Create an instance of Animal
    val animal = Animal("Generic Animal", 5)
    animal.makeNoise()
    animal.displayDetails()

    // Create an instance of Dog
    val dog = Dog("Buddy", 3)
    dog.makeNoise()  // Calls overridden function
    dog.displayDetails()  // Inherits function from Animal
    dog.fetch()  // Calls function specific to Dog
}