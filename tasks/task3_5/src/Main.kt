// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main()
{
    // Add your code here
    val path=Path("balls.txt")
    path.writeText("helo")
    path.appendText("fishy")
    println(path.readText())
}
