// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt
import kotlin.math.min

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double)
{
	init
	{
		require(isValidTriangle())
	}

	val area: Double
		get()
		{
			/*if(!isValidTriangle(triangle))
			{
				throw IllegalArgumentException("Triangle is invalid");
			}*/ //should be impossible to construct an invalid triangle
			val a=sideA
			val b=sideB
			val c=sideC
			val s=(a+b+c)/2
			return sqrt(s*(s-a)*(s-b)*(s-c))
		}

	val perimeter: Double
		get()=sideA+sideB+sideC
	
	val semiPerimeter: Double
		get()=perimeter/2

	fun isValidTriangle(): Boolean
	{
		var a=sideA
		var b=sideB
		var c=sideC
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

	override fun toString(): String
	{
		//Triangle(3.0, 4.0, 5.0)
		return "Triangle($sideA, $sideB, $sideC)";
	}
}