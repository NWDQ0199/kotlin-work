// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal


fun main(args:Array<String>)
{
    if(args.size!=3)
    {
        println("3 arguments required")
        exitProcess(1)
    }
    val initT=args[0].toFloatOrNull()
    val maxT=args[1].toFloatOrNull()
    val incT=args[2].toFloatOrNull()
    if(initT==null||maxT==null||incT==null)
    {
        println("3 floating point arguments required")
        exitProcess(1)
    }
    var t=initT
    while(t<=maxT)
    {
        println("%.2f°C %.2f°F".format(t,9*t/5+32))
        t+=incT
    }
}