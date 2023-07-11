# Lab_1_Javaprogrammering

# Course 1 Javaprogrammering | Java programming
# Laboratory 1: Learn to use Java and Java syntax to solve a number of common problems within programming.


//

### Assignment
Task:
1. Menu
Start by creating a program that on startup prints a menu with the following appearance:
1. Up and Down
2. Min Max
3. Stone Scissors Bag
4. Order and order
e. Terminate
When option e is selected, the program must be terminated. Both e and E should be valid choices to exit.
When selecting one of the other options, these must be run and when the run is complete, the menu must return
is printed on the screen so that a new selection can be made.
2. Up and Down
When choosing option one, the program must read in a number of text strings from the standard input.
The loading is canceled by writing END as a string. When the loading is complete, the strings must be written
out in reverse order according to example. You can either implement a maximum number of strings you can
input or implement it all without limit which is a bit more difficult to solve.
one
two
three
END
three
two
one
3. Min Max
The Min Max option should work roughly like task 2, but now we will instead read in 5 integers and when
the reading is complete, we should print the smallest and the largest number of those read. Even negative numbers should
can be handled. The task can be solved either by using an array that stores the numbers that are read in
or you just store the largest and smallest number so far in two variables. (A solution that uses
5 variables is not approved.)
Example of the loading
1
2
10
-2
100
Min value: -2
Maximum value: 100
4. Stone Scissors Bag
Here you should be able to play stone sax bag against the computer. Let the user input their choice on something appropriate
set and then randomize the computer's choice. First to 3 wins wins. Between each round you must print
who won the round or if it was tied and the current score.
When someone has won 3 times, a congratulatory message must be printed directed at the winner.
5. Order and order
Use the same input for numbers as in task 3 but modify it if necessary so that you can read
enter all numbers as a line of text where the numbers are separated by spaces instead of line breaks.
Also expand so that the program now finds the next largest and second smallest number and adds
add up the numbers and present the sum.
The program must also check whether the numbers are in order so that no smaller number follows a larger one. IN
example below, -2 is less than 10 and the order of numbers is therefore not in order.
Example of loading
1 2 10 -2 100
Min value: -2
2Min value: 1
Maximum value: 100
2Maximum value: 10
In order: false
Total: 111
