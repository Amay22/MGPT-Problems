#MGPT Problem 7

#Connect Four

Connect Four is a two players game which takes place on a 6x7 rectangular board placed vertically between them. One player has 21 yellow coins and the other 21 red coins. The player having yellow coins plays first. Player having red coins makes second move. Then onwards, players take turns. Each player can drop one coin at the top of the board in one of the seven columns, numbered one (1) to seven (7). The dropped coin falls down (due to gravity) and fills the lower unoccupied slot. A player cannot drop a coin in a column if it's already full (i.e. if it already contains six coins).
The objective of the game is to connect four coins of the same colour vertically, horizontally or diagonally. If the board is filled and no one has aligned four coins then the game is drawn (i.e. after 42 moves if no one wins).
You have to write a program to simulate the game and find out which player won and on which move.

#Input specification:

The input consists of a sequence of moves as forty-two numbers in the range of one to seven. Each of those numbers represents the column to which a player has dropped the coin. You can assume that the given move sequence is valid, that is, each column number repeats exactly six times.

#Output specification:

If the game described by the given sequence of moves is a drawn game, your program should output "DRAW". Otherwise, your program should output the colour of winning player's coins followed by the decisive move number, for example, "RED 42" or "YELLOW 37".


#Sample Input and Output:


Input:

		1 1 2 2 3 3 4 4 5 5 6 6 7 7 1 1 2 2 3 3 4 4 5 5 6 6 7 7 1 1 2 2 3 3 4 4 5 5 6 6 7 7

Output:

		YELLOW 7


Input:

		1 2 3 5 4 6 7 1 2 4 3 5 6 6 7 7 1 2 2 1 1 2 3 3 4 3 3 4 4 4 5 5 5 5 6 6 7 7 6 1 7 2

Output:

		DRAW