#MGPT Problem 15

#Identify Pairing

There is a set of N men and N women. Each of them is numbered from 1 to N. They have been married off in pairs. However complete information about the pairs is not available. Some specific clues about the pairs are available. These clues are either of the form:

ith woman, indicated as Wi, is paired with the man Mj
or
woman Wp is not paired with the man Mq
If Wi is paired with Mj then they cannot pair with anyone else.

Given the number N and the clues, you have to write a program, which deduces the complete pairing.
Consider the case where N = 3 and the clues are:

W1 is paired with M2
W3 is not paired with M1

Consider the case of woman W3. She cannot be paired with M1 (given as clue 2). She cannot be paired with M2 either as deducible from clue 1. This leaves only M3 to pair with her. Further, now W2 can only pair with M1 since both M2 and M3 are already paired off.

#Input specification:

The first line contains an integer N denotes the number of pairs
The second line contains an integer C denoting the number of clues which follow
Each of the next C lines contains a clue of the form

= 1 2 
which means woman W1 is paired with man M2
OR
# 3 1
which means woman W3 is not paired with man M1


#Output specification:

You have to print the sequence of integers, each separated by a space, on a single line. The integer at ith location in the sequence denotes the man paired with Wi. The example used in the problem statement is given as the first sample input-output.
Sample Input and Output:


Input:

		3
		2
		= 1 2
		# 3 1

Output:

		2 1 3

Input:

		5
		5
		# 1 3
		# 1 1
		# 3 1
		= 2 4
		= 5 5

Output:

		2 4 3 1 5