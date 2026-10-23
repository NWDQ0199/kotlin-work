// Task 13.4: Money class
data class Money(var euros: Int, var cents: Int)
{
    init
    {
        //require(euros>=0&&cents>=0,{"Cannot have negative euros or cents"})
        //require(cents<=99,{"Cannot have more than 100 cents"})
    }

    operator fun plus(other: Money): Money
    {
        val newCents=cents+other.cents
        //println("newCents: ${newCents}")
        return Money(euros+other.euros+newCents/100,newCents%100)
    }
    //*/

    //operator fun plus(other: Money) {val}
}