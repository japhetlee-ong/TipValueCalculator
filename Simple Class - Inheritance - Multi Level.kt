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

// First child class (inherits from Animal)
open class Dog(name: String, age: Int, val breed: String) : Animal(name, age) {

    // Override function to make a noise
    override fun makeNoise() {
        println("$name barks loudly!")
    }

    // Additional function specific to Dog
    fun fetch() {
        println("$name is fetching the ball.")
    }
}

// Second child class (inherits from Dog)
class Labrador(name: String, age: Int) : Dog(name, age, "Labrador") {

    // Override function to make a noise
    override fun makeNoise() {
        println("$name barks like a Labrador!")
    }

    // Additional function specific to Labrador
    fun swim() {
        println("$name is swimming.")
    }
}

fun main() {
    // Create an instance of Animal
    val animal = Animal("Generic Animal", 5)
    animal.makeNoise()
    animal.displayDetails()

    // Create an instance of Dog
    val dog = Dog("Buddy", 3, "Golden Retriever")
    dog.makeNoise()  // Calls overridden function
    dog.displayDetails()  // Inherits function from Animal
    dog.fetch()  // Calls function specific to Dog

    // Create an instance of Labrador
    val labrador = Labrador("Max", 2)
    labrador.makeNoise()  // Calls overridden function in Labrador
    labrador.displayDetails()  // Inherits function from Animal
    labrador.fetch()  // Calls function specific to Dog
    labrador.swim()  // Calls function specific to Labrador
}
