// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
import kotlin.math.min

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

//fun isValidTriangle(triangle:Triangle)=false
//*
fun isValidTriangle(triangle:Triangle):Boolean
{
    var a=triangle.first
    var b=triangle.second
    var c=triangle.third
    if(a>c)
    {
        val temp=c
        c=a
        a=temp
    }
    if(b>c)
    {
        val temp=c
        c=b
        b=temp
    }
    return a+b>c
}
//*/

//fun triangleArea(triangle:Triangle)=0.0
//*
fun triangleArea(triangle:Triangle):Double
{
    if(!isValidTriangle(triangle))
    {
        throw IllegalArgumentException("Triangle is invalid");
    }
    val a=triangle.first
    val b=triangle.second
    val c=triangle.third
    val s=(a+b+c)/2
    return sqrt(s*(s-a)*(s-b)*(s-c))
}
//*/