// Task 5.1.1: main program
import anagrams.anagrams
import kotlin.system.exitProcess

fun main(args:Array<String>)
{
    if(args.size!=2)
    {
        println("2 arguments required")
        exitProcess(1)
    }
    println(anagrams(args[0],args[1]))
}