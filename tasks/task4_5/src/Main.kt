// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>)
{   
    if(args.size!=1)
    {
        println("1 argument required")
        exitProcess(1)
    }
    val max=args[0].toIntOrNull()
    if(max==null)
    {
        println("1 integer argument required")
        exitProcess(1)
    }
    var sum=0L
    for(i in 1..max step 2) sum+=i
    println("Sum: ${sum}")
}
