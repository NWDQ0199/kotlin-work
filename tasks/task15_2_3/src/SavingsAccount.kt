// Task 15.2.3: SavingsAccount class
import kotlin.math.floor

class SavingsAccount(holder: String, val rate: Double): BankAccount(holder)
{
    fun applyInterest()
    {
        val interest=floor(balance*rate/100)
        deposit(interest.toInt())
    }
}