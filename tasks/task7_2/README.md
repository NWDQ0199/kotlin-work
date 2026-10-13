# Task 7.2

See the Programming Guide for full details of this task.

Your code should be added to `src/Main.kt`.


There are some subtle aspects to using arrays of certain types in Kotlin. To explore these subtleties, let’s try a small example.

Open the tasks/task7_2 directory of your repository and edit the file Main.kt. Add the following main() function to this file:
```
fun main() {

    val numbers = arrayOf(9, 6, 3, 2)


    val cls = numbers::class


    println(cls.qualifiedName)

    println(cls.java)

}
```

Then run the program and make a note of what it prints.

Now modify line 2 of main() so that the intArrayOf() function is called, instead of the arrayOf() function. Run the program again. What has changed?