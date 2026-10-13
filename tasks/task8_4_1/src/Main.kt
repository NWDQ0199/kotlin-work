// Task 8.4.1: experimenting with sequences
import kotlin.time.measureTime

fun main()
{
    val timeWithout=measureTime{val numbers=listOf(1,4,7,2,9,3,8); val result=numbers.filter{it%2!=0}.map{it*it}; println(result)}
    val timeWith=measureTime{val numbers=listOf(1,4,7,2,9,3,8).asSequence(); val result=numbers.filter{it%2!=0}.map{it*it}.toList(); println(result)}

    println("timeWithout: ${timeWithout}\ntimeWith: ${timeWith}")
}