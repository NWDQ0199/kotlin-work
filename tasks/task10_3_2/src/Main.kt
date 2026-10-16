// Task 10.3.2

import kotlin.system.exitProcess
//import kotlinx.coroutines.flow

fun display(text: String?)
{
    println(text?.uppercase()?:"No translation available")
}

fun main(args: Array<String>)
{
    if(args.size!=1)
    {
        println("Single word required as a command line argument")
        exitProcess(1)
    }

    val translate=loadDatabase("en-to-fr.csv")

    val word=args[0].lowercase()
    val result=translate[word]

    //println(result)
    display(result)
}