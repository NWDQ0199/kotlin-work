import kotlin.math.hypot

// Task 12.1: Point class
class Point(var x:Double, var y:Double)
{
    fun distance()=hypot(x,y)
    fun distanceTo(p2:Point)=hypot(x-p2.x,y-p2.y)
}