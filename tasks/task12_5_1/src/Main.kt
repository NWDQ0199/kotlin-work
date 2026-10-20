import kotlinx.datetime.LocalDate

fun main()
{
    val person=Person("harold",LocalDate(1997,8,23))
    println(person.name)
}