// Task 7.7.1: statistics functions
fun median(lst:List<Float>):Float
{
    val len:Int=lst.size
    if(len==0)
    {
        throw IllegalArgumentException("Median undefined for empty list.")
    }
    val lst2=lst.toMutableList()
    lst2.sort()
    return when(len%2)
    {
        0->(lst2[len/2-1]+lst2[len/2])/2.0f
        1->lst2[len/2]
        else->throw Exception("this exception should be unreachable, gg")
    }
}