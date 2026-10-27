// Task 15.2.3: demo program

fun main()
{
    // Write code to demonstrate the classes here
    val account=SavingsAccount("bobster bobson",1.8)
    account.deposit(1250)
    for(i in 0..4) account.applyInterest()
    account.withdraw(50)
    println(account.balance)
}
