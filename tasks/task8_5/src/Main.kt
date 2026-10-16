// Task 8.5: example of using a higher-order function

fun main()
{
    // Add your testing code here
    val s="abcd,439584fhgdaaaaaaaaa"
    println(s.howMany({it=='a'}))
    println(s.howMany({it=='7'}))
}
