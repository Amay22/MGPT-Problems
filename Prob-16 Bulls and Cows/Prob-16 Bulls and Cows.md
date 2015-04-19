#MGPT Problem 16

#Bulls and Cows

You are required to play a game of Bulls and Cows, with a computer. The game is a word-game, and proceeds as follows

The computer 'thinks' of a four-letter word consisting of letters A to D
Then it proceeds to give you several clues, as to what the word is
Given the clues, you have to work-out the word that the computer thought of (secret-word)

The computer, keeping in mind our agrarian roots, gives clues in the form of 'bulls' and 'cows'! Given a guess-word, it tells us the number of 'bulls' and 'cows' in the word. A 'bull' stands for a letter which is in it's correct place in the secret-word, and a 'cow' stands for a letter which is present in the secret-word, but not in the correct place. However, to make the game a bit challenging, the computer does not tell us which letter is a bull and which one is a cow! Bulls are counted first and then cows. Additionally, each letter in the secret-word is counted only once.

For example, if the computer thought of the word: BDAA and the guess-word is: ADDA, then the computer would respond as 2 bulls and 1 cow. This is so, because the letters 'A' and 'D' in the clue word are present in their correct places (with regard to BDAA) and hence 2 bulls. The other 'A' in the guess-word is present in the wrong place (with regard to BDAA) and hence 1 cow.

Given several such clue words and the number of cows and bulls for each word, your program should be able to work out the actual word that the computer had thought of.

NOTE: It is guaranteed that the clues will be enough to work out the secret-word uniquely

#Input specification:

First line contains one integer N indicating the number of clue words which follow
The next N lines contain input of the form: W B C
Where 'W' is a string specifying the clue word, B is an integer specifying the number of bulls and C is an integer specifying the number of cows

#Output specification:

A string which is the word that the computer thought of, i.e., secret-word

#Sample Input and Output:


Input:

		4
		DBCC 0 2
		CDAB 2 1
		CAAD 1 2
		CDDA 2 0

Output:

		BDAA

Input:

		5
		ABCD 0 3
		BCBC 1 1
		BBAA 1 2
		ACAB 0 4
		BAAC 1 3

Output:

		CABA

Input:

		1
		DBCA 4 0

Output:

		DBCA