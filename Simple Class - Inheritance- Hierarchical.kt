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
class Dog(name: String, age: Int, val breed: String) : Animal(name, age) {

    // Override function to make a noise
    override fun makeNoise() {
        println("$name barks loudly!")
    }

    // Additional function specific to Dog
    fun fetch() {
        println("$name is fetching the ball.")
    }
}

// Second child class (inherits from Animal)
class Cat(name: String, age: Int, val color: String) : Animal(name, age) {

    // Override function to make a noise
    override fun makeNoise() {
        println("$name meows softly.")
    }

    // Additional function specific to Cat
    fun scratch() {
        println("$name is scratching.")
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

    // Create an instance of Cat
    val cat = Cat("Whiskers", 2, "Gray")
    cat.makeNoise()  // Calls overridden function
    cat.displayDetails()  // Inherits function from Animal
    cat.scratch()  // Calls function specific to Cat
}
