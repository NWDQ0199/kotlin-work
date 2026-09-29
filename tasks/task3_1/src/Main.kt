// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>)
{
    for(i in 0..(args.size-1))
    {
        println(args[i])
    }
    println("balls")
}