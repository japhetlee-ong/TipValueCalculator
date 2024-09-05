// Define a class Animal with a private property and function
open class Animal(val name: String) {
    
    private var age: Int = 0 // Private property
    
    // Public function to set the age
    fun setAge(age: Int) {
        this.age = age
    }
    
    // Public function to get the age
    fun getAge(): Int {
        return this.age
    }

    // Public function to make noise
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
    // Create an instance of Dog (subclass) and call makeNoise
    val dog = Dog("Buddy")
    dog.makeNoise()

    // Example of private member access (not possible):
    // dog.age = 5  // Error: 'age' has private access in 'Animal'
    // val age = dog.age  // Error: 'age' has private access in 'Animal'
    
    // Example of using public member to set and get age
    dog.setAge(3)
    val age = dog.getAge()
    println("$dog's age is $age")
}