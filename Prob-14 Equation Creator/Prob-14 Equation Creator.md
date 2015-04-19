#MGPT Problem 14

#Equation Creator

You are required to write a program which, when given a sequence of integers, creates an equation. All but the last integer in the given sequence, form an LHS (left-hand-side). The last integer forms an RHS. Operators are inserted between the integers in the LHS to form an expression. Like in any good equation, the LHS must equal the RHS. The operators allowed to be used are: {+, -, *}

You can use any operator at any place and any number of times. An operator can only be placed in between two integers and two integers can have only one operator between them. While evaluating the formed expression, the precedence of operators has to be observed. Note that the positions of integers given cannot be changed.

Thus, if 8, 5, 2, -2 are the integers given, then your program must create the expression: 8 - 5 * 2 = -2 Here, the integers 8, 5, 2 belong to the LHS and integer -2 forms the RHS. The LHS, with placeholders for operators is: 8 5 2. When - and * are inserted, they form an expression: 8 - 5 * 2. Using precedence rules, this evaluates to: 8 - 10, which works out to be equal to RHS.

NOTE:

It is guaranteed that there will be only one possible LHS which equals the RHS.
Expression evaluation is done from left to right, thus expression 2-2+2 evaluates to 2 and not -2.

#Input specification:

First line contains one integer K (3 £ K £ 7) indicating the number of integers
The second line contains 'K' integers, each separated by a space

#Output specification:

The operator sequence without any spaces between them terminated by a newline

Sample Input and Output:

Input:

		4
		8 5 2 -2

Output:

		-*

Input:

		5
		1 1 1 1 4

Output:

		+++

Input:

		5
		7 5 3 2 29

Output:

		*-*