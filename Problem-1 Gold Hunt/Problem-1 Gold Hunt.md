#MGPT Problem 1

#Hunt for Gold!

The hunt for gold is held in a maze. This maze is a two-dimensional array consisting of cells. Each cell in the maze contains one of a displacement value, a trap or the gold. The players are identified by a unique id and are given a starting cell position. They keep jumping from cell to cell as per the displacement values. They keep moving until a winner is declared or they get trapped. The winner is a player who reaches the cell containing gold first.
The displacement value is given by a pair of integers (di, dj). This is added to the current row, column position of the player to find the next cell to jump to. For example, a player on cell (2,3) containing displacement value (1,-2) will jump to cell (3,1). If the next cell position lies outside the maze, then it is wrapped around. For example, if the computed next cell position is (7,-2) for a maze size of (6,6), then the wrapped value of the cell position will be (1,4).

#Input specification:

The first line will contain the number of rows (M) and columns (N) of the maze. M and N will be greater than zero not exceeding fifty (50). The next M lines will contain the contents of the N cells. The (M + 1)th line will contain a number P, indicating the number of players. The next P lines will contain the player id (an integer) and the start position. The start position is indicated by the row and column values. The row as well as column index begins at zero.

The cells will contain either of:

D di dj: Displacement value for the next move.
G: indicating gold cell.
T: indicating a trap cell.

There will always be a unique winner, that is, there will always be a player reaching the gold cell earlier than any other player.

#Output specification:

The id of the winner terminated by a newline.

#Sample Input and Output:

Input:

		5 4
		D 2 0 D 0 2 T D 3 0
		T D 6 0 D 0 3 D 2 0
		D 0 -1 D 1 0 G D 0 -1
		D 0 3 D 0 2 D 0 2 D 0 3
		D -1 0 T D 0 -3 T
		4
		1 4 2
		2 2 0
		3 0 3
		4 2 3

Output:

		4

Input:

		1 2
		G T
		2
		1 0 1
		2 0 0

Output:

		2
