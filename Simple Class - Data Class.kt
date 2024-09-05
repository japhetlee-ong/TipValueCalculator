// Define a data class representing a User
data class User(val id: Long, val name: String, var email: String)

fun main() {
    // Create an instance of User using the constructor
    val user1 = User(1, "Alice", "alice@example.com")
    
    // Access properties of the user
    println("User 1 - Id: ${user1.id}, Name: ${user1.name}, Email: ${user1.email}")
    
    // Copy user1 to create a new instance with modified properties
    val user2 = user1.copy(id = 2, name = "Bob")
    
    // Access properties of the copied user
    println("User 2 - Id: ${user2.id}, Name: ${user2.name}, Email: ${user2.email}")
    
    // Modify a mutable property of the user
    user2.email = "bob@example.com"
    
    // Display modified user properties
    println("User 2 - Modified Email: ${user2.email}")
    
    // Check equality between user1 and user2
    println("User 1 equals User 2: ${user1 == user2}")
}