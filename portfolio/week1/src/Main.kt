// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fn main(args: Array<String>)
{
    if(args.size!=3)
    {
        exitProcess(1);
    }
    val a=args[0]
    val b=args[1]
    val c=args[2]
    val s=(a+b+c)/2
    println({sqrt(s*(s-a)*(s-b)*(s-c))})
}