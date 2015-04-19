#MGPT Problem 21

#Reversi Game

The problem is to simulate a game of Reversi. Reversi is a game played on a board of size 8x8. Two players Black and White play this game. The rows of the board are numbered from 1 to 8 and the columns are labelled a to h. At the beginning of the game, the initial configuration consists of two black discs placed on e4 and d5 and two white discs on d4 and e5. (See figure).
reversi1 	reversi2 	reversi3

Black makes the first move and the two players subsequently take turns making their moves. The two players play the game by placing black and white discs alternately on empty cells of the board. Each placing of the disc is referred to by a code, comprising a character and a digit denoting the column and row of a cell on the board, e.g. d3. A player can choose to skip a turn. In that case the move is indicated by "--".

The crux of the game lies in flanking opponent's discs. Flanking is achieved by entrapping discs of the opponent's colour in between the currently placed disc and a previously placed self-owned disc. All these discs must be in a straight line, vertically, horizontally or diagonally in any orientation. The opponent's discs so trapped, change colour to the player's own colour. This is illustrated in the figure.

Flanking is not cascaded. That is, when a white disc is flanked and changes colour to black, it does not trigger the flanking of other white discs. A chain of mixed discs or gaps is not considered as a flank.

To be precise, a flank is defined as a sequence of discs having following properties:

All the discs in the flank must be in a straight line (vertical, horizontal, or diagonal).
There must be at least three discs in the flank.
The flank must not have any gaps in it.
The ends of the flank must be of the same colour, say C.
All the discs in the flank, except its end-discs, must be of a different colour than C.
One of the ends of the flank must be the disc placed in the current move.

You are given a sequence of valid moves as input. You have to write a program to simulate the moves and then output the winner. The winner is the player having maximum number of discs on the board. If there is no clear winner, then the game ends in a draw.

#Input specification:

First line has an integer M, which denotes the number of moves.
Next M lines each have a code corresponding to a player's moves. The code either consists of an alphabet (a to h) and a digit (1 to 8) or consists of two hyphens '--' indicating skip of the turn.

#Output specification:

The output is the winner of the simulation i.e. 'BLACK' or 'WHITE' and the margin by which the player has won or output 'DRAW'.


#Sample Input and Output:


Input:

		6
		f5
		f6
		c4
		g5
		g7
		e7

Output:

		BLACK 2

Input:

		5
		f5
		d6
		--
		f3
		c5

Output:

		DRAW