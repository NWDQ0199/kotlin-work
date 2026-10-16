// Task 12.3.1: class with secondary constructors

import kotlin.math.hypot

class Point(var x:Double, var y:Double)
{
    fun constructor(var x:Int, var y:Int): this(x.toDouble(),y.toDouble())
    fun distance()=hypot(x,y)
    fun distanceTo(p2:Point)=hypot(x-p2.x,y-p2.y)
}