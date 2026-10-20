// Task 12.8.2: class to represent playing cards
class Card constructor(var rank:Rank, var suit:Suit)
{
    val fullName get()=
    {
        "${rank.name} of ${suit.name}"
    }

    override fun toString():String
    {
        return "${rank}${suit}"
    }
}