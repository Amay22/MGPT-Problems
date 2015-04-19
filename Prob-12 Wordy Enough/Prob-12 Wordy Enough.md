#MGPT Problem 12

#Wordy Enough

A student, doing his apprenticeship as a linguist, is given a rather boring problem. His mentor has given him a list of words and a long string of characters. All the characters in the list of words and the long string of characters are in capital. The student has to look at the characters and decide how many words from the given list can be formed using the long string of characters. However, there are some rules of counting:

    Each character in the word must be accounted for in the character stream, i.e. if a character appears twice in a word, then it must also appear twice in the stream. For example, the word 'NEED' can only be formed if 'E' occurs twice in the long character string.
    Once a character is used up for a word, it cannot be used again for forming other words.

The student has to form the maximum number of words possible. You have to write a program to do this and help him to concentrate on other more interesting problems.

#Input specification:

    The first line of input contains an integer 'w', which denotes the number of words in the list.
    The second line of input consists of 'w' words, each separated by a white space. The length of each word will never exceed 20 characters.
    The third line of input contains an integer 's' which denotes the number of characters in the long string of characters.
    The fourth line of input, which is a long character string, consists of 's' characters.

#Output specification:

Your program has to output an integer 'm', denoting the maximum number of words possible.

#Sample Input and Output:

Input:

		9 
		SATAN SEES OASIS STRAIGHT FORWARD SENSE FROG DREW SHIRTS 
		20 
		AAEEIODFGHNRRRSSSTTW

Output:

		4

Hint: This problem may be solved using recursion.