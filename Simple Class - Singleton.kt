// Singleton class representing a Logger
object Logger {
    
    // Function to log messages
    fun log(message: String) {
        println("[INFO] $message")
    }
    
    // Function to log errors
    fun error(message: String) {
        println("[ERROR] $message")
    }
}

fun main() {
    // Access the singleton instance and use its functions
    Logger.log("Application started")
    Logger.error("Null Pointer Exception occurred")
}
