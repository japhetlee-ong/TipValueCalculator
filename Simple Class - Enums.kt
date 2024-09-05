// Define an enum class representing different days of the week
enum class DayOfWeek(val abbreviation: String, val isWeekend: Boolean) {

    // Enum constants with associated properties
    MONDAY("Mon", false),
    TUESDAY("Tue", false),
    WEDNESDAY("Wed", false),
    THURSDAY("Thu", false),
    FRIDAY("Fri", false),
    SATURDAY("Sat", true),
    SUNDAY("Sun", true);

    // Method to print the full name of the day
    fun fullName(): String {
        return when (this) {
            MONDAY -> "Monday"
            TUESDAY -> "Tuesday"
            WEDNESDAY -> "Wednesday"
            THURSDAY -> "Thursday"
            FRIDAY -> "Friday"
            SATURDAY -> "Saturday"
            SUNDAY -> "Sunday"
        }
    }
}

fun main() {
    // Access enum constants and their properties
    val today = DayOfWeek.SUNDAY
    println("Today is ${today.fullName()}, abbreviated as ${today.abbreviation}")

    // Loop through all days of the week
    println("\nDays of the Week:")
    DayOfWeek.values().forEach {
        println("${it.fullName()} (${it.abbreviation}) - ${if (it.isWeekend) "Weekend" else "Weekday"}")
    }
}
