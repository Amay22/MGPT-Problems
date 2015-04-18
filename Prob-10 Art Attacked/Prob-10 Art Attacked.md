#MGPT Problem 10

#Art Attacked

In a room of a museum there is a famous painting. A secret overhead-rotating camera is attached in the centre of the room. A robber is trying to steal the painting. You have to write a program to determine whether the robber is seen through the camera.

The room of the museum can be considered in the form of a square matrix, M rows by M columns where M is always odd. The camera is fixed in the centre of the room. The numbering of rows and columns is always from left to right and top to bottom.

Museum

Motion and visibility of Camera:
The camera is always initially in the position as shown in fig 1 i.e. facing the top. It rotates clockwise. In each position the camera can see it's own cell and all the cells directly in a line in front of it. In a unit time interval, the camera rotates clockwise by 45o. This is illustrated below:

Museum

Robber's movement:
In a unit time interval, the robber can move by one cell in any direction. You are given the robber's movements in terms of matrix cells. You should tell whether the robber is seen through the camera or not. If the robber is seen you should give the position at which he is seen.

#Input specification:

The first line of input consists of an integer M indicating M rows and columns. M is always odd.
The next line contains the integer T, the number of time intervals the robber takes to go to the painting and return to the start point.
Next T pairs of integers are given, each pair, indicating the row and column number for the position of the robber in that particular time instant.
Assume that the given path traced by the robber is a valid one.

#Output specification:

If the robber succeeds in evading the camera, you have to print "DONE", else print the row number and column number separated by a white space, indicating the cell where the robber was first seen through the camera. Your output has to be terminated with a newline.


#Sample Input and Output:

Input:

		3
		9
		0 0 0 1 0 2 1 2 2 2 2 1 2 0 1 0 0 0 

Output:

		2 1

Input:

		5
		9
		0 0 1 1 2 2 2 3 2 4 2 3 2 2 1 1 0 0

Output:

		2 2