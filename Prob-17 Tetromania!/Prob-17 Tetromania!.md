#MGPT Problem 17

#Tetromania!

A tetromino is a geometric shape comprising of four equal squares, connected at their edges. There are seven possible tetrominoes, each of which is uniquely labeled and are shown in the Fig 1 below.

Tetrominoes

Given a bucket full of tetrominoes and a matrix with slots, you have to write a program to fit the tetrominoes into the matrix slots. You can rotate a tetromino in order to fit into a matrix slot. The rotation allowed is in steps of 90, 180, 270 and 360 degrees only.

Tetrominoes

It is guaranteed that two slots will not share an edge, though they may touch at a corner. From the bucket there will be one tetromino that will not fit into any slot. The label of that tetromino should be output. It is guaranteed that there will be only one such tetromino, which will not fit. All other tetrominoes will exactly fit into some slot or the other.

#Input specification:

The first line contains an integer L denoting the number of tetrominoes.
The second line contains a string of length L denoting the number of tetrominoes available in the bucket.
The next line contains two integers M and N denoting the number of rows and columns of the matrix respectively.
The matrix then follows in the form of the integers 0 or 1. The zeroes in the matrix denote the slots. This matrix is given in the form of M lines each containing N integers.

#Output specification:

The output should be the label of the unused tetromino.


#Sample Input and Output:


Input:

		7
		ZOOSOIL
		9 13
		1 1 0 0 0 0 1 1 1 1 1 1 1
		1 1 1 1 1 1 1 1 1 1 1 1 1
		1 1 1 1 1 0 1 1 1 1 1 1 1
		1 1 1 1 1 0 0 1 1 1 1 1 1
		1 1 1 1 1 1 0 1 1 1 1 1 1
		1 1 1 1 1 1 1 0 0 1 1 1 1
		1 0 0 1 1 1 1 1 0 0 1 1 1
		1 0 0 1 1 0 0 1 1 1 0 0 0
		1 1 1 1 1 0 0 1 1 1 0 1 1

Output:

		O

Input:

		5
		TOLLI
		6 6
		1 0 1 1 1 0
		0 0 0 1 1 0
		1 1 1 0 1 0
		1 0 0 0 1 0
		1 1 1 1 0 1
		1 1 0 0 0 1

Output:

		O