// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args:Array<String>)
{
    if(args.size!=3)
    {
        println("3 arguments required")
        exitProcess(1)
    }
    val a=args[0].toFloatOrNull()
    val b=args[1].toFloatOrNull()
    val c=args[2].toFloatOrNull()
    if(a!=null&&b!=null&&c!=null)
    {
        val avg=((a+b+c)/3f).roundToInt()
        val grade=when(avg){
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "?"
        }
        print("%d, %s".format(avg,grade))
    }
    else
    {
        println("error")
    }
}