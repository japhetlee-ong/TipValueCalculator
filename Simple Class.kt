// Define a class named Person
class Person(val name: String, var age: Int) {

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
    // Create an instance of Person
    val person1 = Person("Alice", 30)

    // Access properties and methods of the Person class
    person1.introduce()
    person1.celebrateBirthday()
}
