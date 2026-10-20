// Task 12.8.2: class to represent playing cards
class Card constructor(var rank:Rank, var suit:Suit)
{
    val fullName()
    {
        return "${rank.name} of ${suit.name}"
    }

    override fun toString()
    {
        return "${rank}${suit}"
    }
}