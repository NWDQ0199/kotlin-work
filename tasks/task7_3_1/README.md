# Task 7.3.1

Your code should be added to `src/Main.kt`.

See the Programming Guide for full details of this task.

Open the tasks/task7_3_1 directory of your repository. Edit Main.kt and write a program that creates and displays a list of integers like this:
```
val numbers = listOf(9, 3, 6, 2, 8, 5)
println(numbers)
```
Check that the program compiles and runs successfully.

Now make the changes listed below. After making each change, try to predict what will happen when you attempt to recompile and rerun the program. Then perform those actions to see if you were right.

1.  Add a line of code that prints the value of `numbers[0]`.

2.  Add a line that attempts to print the value of `numbers[10]`.

3.  Replace the line that you added in the previous step with a different line that prints the value of `numbers.slice(2..4)`.

4.  Add a line that prints the value of `numbers.first()`. Then add a line that prints the value of `numbers.last()`.[2]

5.  Add a line that assigns a new value to `numbers[0]`.

6.  Replace the line that you added in the previous step with `numbers.add(1)`.

You should have seen that the last two of these changes fail to compile.