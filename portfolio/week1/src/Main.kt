// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>)
{
    if(args.size!=3)
    {
        println("Error: values for a, b, c required on command line");
        exitProcess(1);
    }
    val a:Float?=args[0].toFloatOrNull()
    val b:Float?=args[1].toFloatOrNull()
    val c:Float?=args[2].toFloatOrNull()
    if(a==null||b==null||c==null)
    {
        println("all arguments must be numeric!");
        exitProcess(1);
    }
    val s=(a+b+c)/2
    println("Area = %.5f".format(sqrt(s*(s-a)*(s-b)*(s-c))))
}