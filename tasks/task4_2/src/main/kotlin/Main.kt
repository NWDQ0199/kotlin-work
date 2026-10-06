// Task 4.2: use of if and ranges

fun main()
{
    // Add your code here
    val inp=readln().lowercase()
    if(inp.length==1&&inp[0] in 'a'..'d')
    {
        println("Order accepted")
    }
    else
    {
        println("Invalid choice!")
    }
}
