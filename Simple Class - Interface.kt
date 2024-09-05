// Interface defining animal behaviors
interface Animal {

    // Abstract method to make a noise
    fun makeNoise()
    
    // Abstract method to move
    fun move()
}

// Class implementing the Animal interface
class Dog(val name: String) : Animal {

    // Implement makeNoise method
    override fun makeNoise() {
        println("$name barks loudly!")
    }

    // Implement move method
    override fun move() {
        println("$name is running.")
    }
}

// Class implementing the Animal interface
class Bird(val name: String) : Animal {

    // Implement makeNoise method
    override fun makeNoise() {
        println("$name chirps.")
    }

    // Implement move method
    override fun move() {
        println("$name is flying.")
    }
}

fun main() {
    // Create instances of Dog and Bird
    val dog = Dog("Buddy")
    val bird = Bird("Sparrow")

    // Call methods defined in Animal interface
    dog.makeNoise()
    dog.move()

    bird.makeNoise()
    bird.move()
}