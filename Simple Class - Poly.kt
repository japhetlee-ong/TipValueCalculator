// Define an open class Animal
open class Animal(val name: String) {

    // Open function to make noise
    open fun makeNoise() {
        println("$name makes a noise.")
    }
}

// Subclass Dog inheriting from Animal
class Dog(name: String) : Animal(name) {

    // Override the makeNoise function
    override fun makeNoise() {
        println("$name barks loudly!")
    }
}

// Subclass Cat inheriting from Animal
class Cat(name: String) : Animal(name) {

    // Override the makeNoise function
    override fun makeNoise() {
        println("$name meows softly.")
    }
}

//THIS IS ALSO KNOWN AS RUN-TIME POLY
fun main() {
    // Create instances of Dog and Cat
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    // Polymorphism: Using Animal references to refer to Dog and Cat objects
    val animals: Array<Animal> = arrayOf(dog, cat)

    // Loop through the array and call makeNoise on each Animal
    for (animal in animals) {
        animal.makeNoise() // Calls the appropriate overridden function
    }
}