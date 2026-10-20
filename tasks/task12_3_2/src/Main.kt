// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main()
{
    val birthDate=LocalDate(1997,8,23)
    val marriedPerson=Person("Joe",birthDate).apply{isMarried=true}
    //val person=Person("",birthDate) //IllegalArgumentException: Name cannot be blank
}