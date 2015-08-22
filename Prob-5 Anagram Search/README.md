#MGPT Problem 5

#Anagram Search

You will be given a two-dimensional matrix filled with words separated by '#'. You will also be given a word whose anagrams are to be searched in the matrix. The anagrams can occur horizontally or vertically. An anagram is a word that contains exactly same letters of the given string, but not necessarily in the same order. The anagram has to be a complete word and not a part of another word, for example catc does not qualify as an anagram. Also, if a letter occurs twice in a word, its anagram will have that letter exactly two times. For example, cta, cat, atc, tac, tca and act are all the anagrams of cat. Also note that, the anagrams of POLO include LOOP and POOL but not PLOP and POLL. The search for anagrams is case-sensitive, i.e., the word Cat is NOT an anagram of the word cat.

#Input specification:

The first line of input will contain the word whose anagram is to be found. The next line will contain two integers, M and N, separated by a single blank space. They represent the number of rows and columns respectively, of the character matrix. The next M lines will contain N characters. M and N each will be greater than zero (0) not exceeding thirty (30).

#Output specification:

The output will consist of a single integer, which represents the number of anagrams found in the matrix.


#Sample Input and Output:


Input:

		cat
		4 5
		c#tc#
		a#atc
		tc#ac
		cta#c

Output:

		3

Input:

		RING
		7 7
		r#I#NG#
		I#R#R##
		I#G#RNG
		g#NIGR#
		n##RING
		I#n#r#g
		Ring###

Output:

		3