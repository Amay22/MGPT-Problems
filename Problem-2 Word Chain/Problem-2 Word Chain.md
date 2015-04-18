#MGPT Problem 2

#Word Chain

You have to write a program to chain some words. A word is properly chained if it starts with a trailing sub-string of its predecessor word with a minimum overlap of three (3) characters. Given a number of words, you have to reorder them to appropriately chain them. The first word in the input is used as a starting word in the chain. It may happen that there is no chaining possible for a given set of words. If chaining is possible, assume that there will be a unique word chain.

Note: A word is a sequence of alphabetic characters.

#Input specification:

The first line will be an integer N, indicating the number of words that will follow. Assume N will never be greater than twenty (20). The next N lines of input will contain words, which are to be chained. Assume that the maximum length of a word will never exceed thirty (30) characters.

#Output specification:

Your program should output the chain of words, one word on a separate line. If there is no chain possible from the given words, the program should print IMPOSSIBLE followed by a newline character.

#Sample Input and Output:

Input:

		2
		start
		finish

Output:

		IMPOSSIBLE


Input:

		8
		whisper
		format
		perform
		sonnet
		person
		shopper
		workshop
		network

Output:

		whisper
		person
		sonnet
		network
		workshop
		shopper
		perform
		format

