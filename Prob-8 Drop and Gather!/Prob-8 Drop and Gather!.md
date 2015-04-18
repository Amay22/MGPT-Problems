#MGPT Problem 8

#Drop and Gather!

There are many insects in this world and strange ones too! Two peculiar species have just been noticed by our scientist and are studying their behaviour.
This observation is being carried out in a small grid, which appears like a two dimensional matrix. This grid consists of ten rows and ten columns. The row and column numbers start from zero.
So far the scientists have noted the following.

    Each of the insect species takes one minute to move from one cell to another.
    They move along straight lines only and never along diagonals. So they move in the north (N), south (S), east (E) or west (W) direction. The north direction is toward rows of a smaller value. The west is toward the columns of lower value.
    One of the insects drops a unit of chemical substance, called pherom every minute. Therefore the scientist named these creatures droppers. The other species collects one unit of pherom if it comes across it. The scientists called these gatherers.
    The gatherers can collect only one unit of pherom in one minute. Also they never collect more than one unit from a cell, even if it can. After collecting one unit of pherom from the current cell they move on to the next cell in the next minute, even though the cell they are in contains more than one unit of pherom.
    These insects keep repeating their movements in a periodic fashion. Like as if a sequence were built into them. So for example if an insect had the sequence NSWNES built into it then it would move north in the first minute, south in the second minute, west in the third, and so on. In the seventh minute again it goes north, eighth south and so on.
    The dropping and gathering actions are instantaneous. Hence if a dropper and gatherer comes into a cell at the same time then the gatherer gathers whatever the dropper drops before both of them proceed to the next cell.

If any of these insects move out of the grid, they cannot re-enter.

Assume that there is no pherom in the grid at the start.

#Input specification:

The first line will be an integer N (< 10), the number of insects.
The next N lines will be of the following format.

<id> <type> <start row coordinate> <start column coordinate> <sequence>

id      	: is a positive unique integer to identify that insect
type    	: a character D/G depending on whether the insect is a dropper/gatherer
sequence	: is a string as described above

The next line will contain an integer T, the time duration of observation.
The last line will contain the row and column co-ordinates of a specific cell.

#Output specification:

You will have to print the amount of pherom present in the specified cell at the end of T minutes. The coordinates of this cell are given as the last line of input.


#Sample Input and Output:


Input:

		2
		1 D 5 1 E
		2 G 5 8 W
		5
		5 3

Output:

		0

Input:

		5
		1 D 1 0 ESE
		2 G 5 2 ENES
		3 D 2 9 S
		4 G 7 5 ESEN
		5 D 3 8 WSWN 
		9
		4 5

Output:

		1


