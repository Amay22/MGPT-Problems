#MGPT Problem 4

#Crossword

You have to write a program to complete a partially filled crossword. Consider a partially filled crossword as shown in Figure 1. You will be given a list of words. These are to be inserted into the crossword to fill it completely. For example, given the words: at, see, pool, stop, and tall, the completed crossword will be as shown in Figure 2.
Cross

To complete the crossword, you can make use of two kinds of clues: the length of the slot and the given characters in a slot. There will be exactly one word matching the given slot satisfying the clues. For example, pool cannot be fitted in the slot where stop or tall is (see Figure 2). It obviously cannot fit in slots of at and see. You can also assume that there will be a unique solution to the crossword.

#Input specification:

The first line will contain two integers r and c, the number of rows and columns respectively. The next r lines will contain c characters each. The next line will consist of number of words to be inserted. The line following that will consist of the actual list of words to be inserted, in the ascending order of length of the word. Each word will be separated by a blank space.

In the input, the blank cells, which are to be filled in, are represented by a hyphen '-'. The shaded cells are represented by a '#'. Apart from these special characters, only lowercase alphabets are used.

There will not be more than ten (10) words to be filled in the crossword. The length of each word to be filled in will not exceed fifteen (15) characters. The size of the crossword will not exceed eighty (80), i.e., number of rows and number of columns each will not exceed eighty (80).

#Output specification:

The output would be r lines of c characters each corresponding to the filled in version of the crossword.

#Sample Input and Output:

Input:

		3 5
		-----
		-###-
		----#
		4
		to sea acid sweet

Output:

		sweet
		e###o
		acid#