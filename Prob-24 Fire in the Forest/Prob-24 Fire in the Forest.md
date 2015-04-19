#MGPT Problem 24

#Fire in the Forest

Given a rectangular region consisting of forests, lakes and oil tankers, you have to write a program, which finds how much of the forest is affected by the fire caused by a powerful bolt of lightning.

The forests in the given region are all dried up and ready to burn. When a tree in the forest catches fire, all the neighboring trees catch fire too and begin to burn. This in turn burns their (unburned) neighboring trees, and thus the fire spreads in the forest. In normal circumstances, fire cannot spread over the lake. It so happens in this problem that there are some large oil tanker ships, filled to the brim with extremely flammable crude oil, anchored somewhere in lakes. If the fire ever reaches any neighboring cell of a tanker, the tanker explodes and all the oil it is carrying spills over the water of that particular lake. This allows the fire to spread over the lake. Thus a fire in one forest can spread to other forests separated by lakes, provided there is an oil tanker anchored on the edge of this forest.

The rectangular region will be given as a grid of cells. Each cell of the region will represent one of the following: a forest, a lake, or an oil tanker. For each cell in the region, there can be at the maximum eight neighboring cells. Note that the cells, which share even a corner, are considered as neighbors.

#Input specification:

The first line has two integers M and N indicating the number of rows and columns of the region respectively. 0 < M, N <= 20
M lines follow the first line. Each of these M lines contains N characters and a terminating newline. Each character is either of #, ~, and @. The meanings of these characters are:
# 	Forest
~ 	Lake
@ 	Oil Tanker
The last line has two integers X and Y indicating the row and column index values where the powerful bolt of lightning strikes. 0 <= X < M, and 0 <= Y < N. If the lightning strikes in the lake, nothing happens. If the lightning strikes in the forest or on the oil tanker, fire starts spreading from that cell.

#Output specification:

Your program should compute and print the number of forest cells burned due to the fire.


#Sample Input and Output:


Input:

		4 5
		##~~#
		~~@~~
		~~~##
		#~~#~
		0 0

Output:

		7


Input:

		10 9
		#########
		~~~~~~~~~
		~~#####~~
		~~#~~~#~~
		###~@~###
		~~#~~~#~~
		#~#####~#
		#~~~@~~~#
		#~~###~~#
		#~#####~#
		4 4


Output:

		36
