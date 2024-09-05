// Define a class named Person with primary and secondary constructors
class Person {

    var name: String
    var age: Int

    // Primary constructor with default values
    constructor(name: String = "Unknown", age: Int = 0) {
        this.name = name
        this.age = age
    }

    // Secondary constructor
    constructor(name: String) {
        this.name = name
        this.age = 0 // Default age
    }

    // Method to introduce the person
    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }

    // Method to increase age
    fun celebrateBirthday() {
        age++
        println("$name is celebrating their birthday! Now they are $age years old.")
    }
}

fun main() {
    // Create instances of Person using primary and secondary constructors
    val person1 = Person()
    person1.introduce()

    val person2 = Person("Alice")
    person2.introduce()
    person2.celebrateBirthday()
}
