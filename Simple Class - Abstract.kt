// Abstract class representing an Animal
abstract class Animal(val name: String) {

    // Abstract method to make a noise (must be overridden)
    abstract fun makeNoise()

    // Concrete method to display details
    fun displayDetails() {
        println("$name is a ${this.javaClass.simpleName}")
    }
}

// Concrete subclass Dog inheriting from Animal
class Dog(name: String) : Animal(name) {

    // Implement abstract method makeNoise
    override fun makeNoise() {
        println("$name barks loudly!")
    }
}

// Concrete subclass Cat inheriting from Animal
class Cat(name: String) : Animal(name) {

    // Implement abstract method makeNoise
    override fun makeNoise() {
        println("$name meows softly.")
    }
}

fun main() {
    // Create instances of Dog and Cat
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    // Call methods defined in Animal abstract class
    dog.makeNoise()
    dog.displayDetails()

    cat.makeNoise()
    cat.displayDetails()
}