// Define a class named Person with a default constructor
class Person(var name: String = "", var age: Int = 0) {

    // Init block to initialize properties
    init {
        if (name.isBlank()) {
            name = "Unknown"
        }
        if (age < 0) {
            age = 0
        }
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
    // Create an instance of Person using default constructor
    val person1 = Person()
    person1.introduce()

    // Create another instance of Person with specified values
    val person2 = Person("Bob", 25)
    person2.introduce()
    person2.celebrateBirthday()
}