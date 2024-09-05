// Sealed class representing different types of Payment
sealed class PaymentMethod {

    // Subclasses of PaymentMethod
    class CreditCard(val number: String, val expiryDate: String) : PaymentMethod()
    class PayPal(val email: String) : PaymentMethod()
    object Cash : PaymentMethod() // Object subclass representing Cash payment
}

// Function to process payment based on PaymentMethod
fun processPayment(paymentMethod: PaymentMethod) {
    when (paymentMethod) {
        is PaymentMethod.CreditCard -> {
            println("Processing credit card payment with number ${paymentMethod.number}")
        }
        is PaymentMethod.PayPal -> {
            println("Processing PayPal payment with email ${paymentMethod.email}")
        }
        PaymentMethod.Cash -> {
            println("Processing cash payment")
        }
    }
}

fun main() {
    // Create instances of different PaymentMethod subclasses
    val creditCard = PaymentMethod.CreditCard("1234 5678 9012 3456", "12/25")
    val payPal = PaymentMethod.PayPal("alice@example.com")
    val cash = PaymentMethod.Cash

    // Process payments using the processPayment function
    processPayment(creditCard)
    processPayment(payPal)
    processPayment(cash)
}