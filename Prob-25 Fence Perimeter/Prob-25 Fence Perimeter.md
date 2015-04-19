#MGPT Problem 25

#Fence Perimeter

A building is situated in a rectangular plot of size M x N. It is decided to grow a lawn around the building and then build a fence around the lawn.

Refer to the adjoining figure. It shows the rectangular plot of dimensions 12x10. The cells occupied by the building are shown in darker shade. The boundary walls of the building are formed by the horizontal and vertical edges of the cells. The building cells will always be touching one another. That is, there will not be two (or more) unconnected buildings in the compound. There will not be any holes (that is, empty cells surrounded by the building on all sides) in a building as well. The lawn is grown in each cell, which shares an edge or a corner with building. The cells with lawn grown in them are shown with lighter shade in the figure.
Fence Perimeter

A fence is built along the edges of the cells such that it inscribes the lawn (and of course building). The fence is not built along the boundary of rectangular plot, as the compound walls are already in place. The figure shows the fence using a dashed line along the lawn cell edges. You have to write a program to calculate the perimeter of the fence. Satisfy yourself that the perimeter of the fence in the figure indeed equals 39.

#Input specification:

The first line has two integers M and N indicating the number of rows and columns of the rectangular plot respectively.
Each of the following M lines contains N characters, terminated by a newline. The character sequence consists of either '#' or '^'. A '#' indicates a building cell, while a '^' character denotes free space.

#Output specification:

Your program should print the length of the perimeter.


#Sample Input and Output:


Input:

		12 10
		^^^^^^^^^^
		^^^^^^#^^^
		^^^^####^^
		^^^^####^^
		^^####^^^^
		^^####^^^^
		^^^^##^^^^
		^^^^####^^
		^^####^^^^
		^^######^^
		^^^^^^^^^^
		^^^^^^^^^^

Output:

		39


Input:

		12 10
		^^^^^^^^^^
		^^#####^^^
		^^###^^^^^
		^^#####^^^
		^^##^^^^^^
		^^##^^^^^^
		^^#####^^^
		^^##^^^^^^
		^^##^^^^^^
		^^##^^^^^^
		^^#####^^^
		^^^^^^^^^^

Output:

		30