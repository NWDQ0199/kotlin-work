// Task 5.1.2: main program
import die.rollDie
import kotlin.system.exitProcess

fun main(args:Array<String>)
{
    for(i in 0..3)
    {
        rollDie(4)
        rollDie(6)
        rollDie(8)
        rollDie(10)
        rollDie(12)
        rollDie(20)
    }
}