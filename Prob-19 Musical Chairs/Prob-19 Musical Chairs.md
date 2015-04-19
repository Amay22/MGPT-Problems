#MGPT Problem 19

#Musical Chairs

Musical Chairs is one of the popular games played at a party. The basic concept prevailing in this game is that of N people vying for N-1 chairs. The game takes place in a field of size N+1 cells by three (3) cells. Initially the chairs are placed in a line in the middle. The orientations of these chairs alternate, such that the neighbors face opposite directions. First chair always faces East End. A typical arrangement with N equals to five (5) is shown below.

Musical Chairs

In the beginning of the game, all the players stand in a single row on the West End as indicated by the filled ovals. The players are labeled alphabetically by the first N alphabets. They occupy the first N rows in alphabetic order, i.e. A occupies first cell (left-top) and so on. When the music starts playing, each player uniformly takes a step forward per unit time into the next cell. This process is continued till the music stops. When the music stops the players try and occupy the chairs. They continue to move one cell at a time to obtain a chair. The players can only occupy the chairs in their current cell or those that they encounter on moving forward. It is not possible to step backwards to occupy a chair. The person who does not occupy a chair does not play anymore.

Then a chair is removed from the south end. The players step out of the chair to the cell in front of it. The figure two shows the cells to which players in chairs 1 and 3 will step out. Then the music is started again. The game proceeds as described earlier. Note that, the removal of a chair will reduce the number of cells to be stepped through by two cells. Refer to figure one for initial configuration for the first sample input. Figure two shows the configuration of players and chairs before music starts for the second time.
You are required to simulate this game and find the winner.

#Input specification:

The first line contains an integer N, the number of players. The players are implicitly labeled alphabetically by the first N capital alphabets. N will never exceed 20.
The next line contains N-1 integers separated by spaces representing the durations for which the music plays.

#Output specification:

The output should be the label of the winning player.

#Sample Input and Output:

Input:

		5
		3 8 6 5

Output:

		E

Input:

		2
		5

Output:

		A