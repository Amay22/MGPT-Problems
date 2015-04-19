#MGPT Problem 26

#DFA Simulator

Deterministic finite automatons (DFA) are simplified models of computers with extremely small memory. Such computers are at the heart of various electro-mechanical devices, such as automatic doors, washing machines, elevators, etc.

The formal definition of a DFA includes four components: Q, A, T, F

Q is a set of states of the DFA
A is the alphabet of the DFA.
T is a transition function, which given a state q from Q and a letter of the alphabet, say x, from A, returns a new state from Q. Thus New State = T(q, x).
F, a subset of Q, indicates the final states of the DFA.

As an example, consider a DFA: D defined as below:

Q = { q1, q2, q3 }
A = { a, b }
T is the transition function given by the following matrix

|    | a  | b  |
|----|----|----|
| q1 | q1 | q2 |
| q2 | q3 | q2 |
| q3 | q2 | q2 |

F = { q2 }

The DFA described above can be visualized as a state transition diagram (as given in the figure).

To simulate a DFA, you need an input string. This string is composed of the letters from the alphabet, i.e., the set of letters given in A. The DFA's initial state is always q1. It scans the input string, left to right, one letter at a time. Depending on its current state and the letter it has just read, the DFA uses its Transition Function to determine its next state. Thus, in the example given above, if the DFA, starting off in q1, reads 'b' as its input string, it will check its Transition Function to determine that the next state is q2. This goes on till the input string is exhausted. At the end, if the state of the DFA is a state that is present in F, then the string is accepted, else the string is rejected.

#Input specification:

The first line has two integers M and N. M indicates the number of states of the DFA. The states are implicitly labelled q1, q2, …, qM. N denotes the length of the alphabet, i.e., the number of letters in the alphabet. The letters are implicitly labelled a, b, … Thus if N is three, then A, the alphabet of the DFA, is { a, b, c }. N is guaranteed to be less than 26.
The next M lines describe the transition function T. Each line contains N integers. These integers describe the transition state given the initial state and the letter. Thus the kth integer on the ith line (ignoring first line of the input) indicates the transition state, given qi and kth alphabet. Refer to first sample input, which translates the DFA: D given above.
The next line contains an integer O indicating the number of final states. This is followed by O integers on the same line. These integers together form F, i.e., the set of possible final states of the DFA. ,/li>
The next line has an integer K, denoting the number of input strings to follow. K input strings follow, one on each line.
Each one of the K lines is has an integer W, which denotes the length of the input string, followed by a string of letters from A forming the input string. Each input strings is known to be accepted by the DFA.
Each string has a missing letter denoted by '?'. Your program has to discover the missing letter.

#Output specification:

You program should print K letters on a single line. Each of the letters replacing the question mark in its corresponding input string should make the string acceptable by the DFA. It is assured that there is a unique letter from the DFA alphabet that can take the place of '?' in the input string so as to make it acceptable to the DFA. Terminate the output by a new-line.


#Sample Input and Output:

Input:

		3 2
		1 2
		3 2
		2 2
		1 2
		3
		1 ?
		7 aabb?aa
		20 babaaaaaaaaaaaaaab?a

Output:

		bba

Input:

		1 1
		1
		1 1
		4
		1 ?
		2 a?
		4 aa?a
		8 aaa?aaaa

Output:

		aaaa