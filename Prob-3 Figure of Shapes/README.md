#MGPT Problem 3

#Figure of Shapes

Given a two-dimensional array filled with zeroes and ones, your program has to identify the shapes formed in the array, by the ones. All the shapes will be disjoint, i.e., they will not share any common boundary. Also, the shapes will be one of square, rectangle or triangle. There will not be any other type of shape included in the array. Every cluster of ones will have at least three ones.

#Input specification:

The first line of the input will consist of two integers: M and N. They indicate the number of rows and columns of the array, respectively. The next M lines of input will contain N integers each consisting of a sequence of zeroes and ones. M <= 25 and N <= 25. Assume that all the sides of rectangle and square are parallel to the axes. Also assume that one side of triangle is parallel to one of the axes.

#Output specification:

Your program has to print the words triangle, square or rectangle, depending on the shape formed by the ones. The order in which the shapes are printed must be: left to right and top to down. Each shape encountered has to be output on a line by itself. If there is no shape in the array, the program should simply print empty on a line by itself.

#Sample Input and Output:


Input:

		4 5
		0 0 1 0 0
		0 1 1 1 0
		1 1 1 1 1
		0 0 0 0 0

Output:

		triangle


Input:

		12 23
		0 1 1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 0 0 0 0 0 0
		0 1 1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 0 0 0 0 0 0
		0 1 1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 0 0 0 0 0 0
		0 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0
		0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 1 0 0 0 0 0
		0 0 0 1 1 1 0 0 1 1 0 0 0 0 0 0 1 1 1 0 0 0 0
		0 0 0 1 1 1 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 0 0
		0 0 0 0 0 0 0 0 0 0 1 1 1 1 0 0 0 0 0 1 1 0 0
		0 0 0 0 0 0 0 1 1 0 0 1 1 1 1 1 0 0 0 1 1 0 0
		0 0 0 0 0 0 0 1 1 0 0 0 1 1 1 1 1 1 0 0 0 0 0

Output:

		square
		rectangle
		triangle
		triangle
		rectangle
		square 
		square