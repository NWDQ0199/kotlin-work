// Task 7.3.1: list element access
fun main()
{
    val numbers=listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0]) //1
    //println(numbers[10]) //2 runtime exception
    println(numbers.slice(2..4)) //3 6,2,8
    println(numbers.first()) //4 9
    println(numbers.last()) //4 5
    //numbers[0]=1 //compilation error
    //numbers.add(1) //compilation error (since add isn't defined for List)
}