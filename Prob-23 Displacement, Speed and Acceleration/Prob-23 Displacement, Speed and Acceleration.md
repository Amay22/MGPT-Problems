#MGPT Problem 23

#Displacement, Speed and Acceleration

In Kinematics scientists try to devise mathematical models to describe and explain the motion of the real-world objects. In doing so they have found the study of calculus a very useful one. The relationships between physical quantities, such as displacement and speed, are easily expressed using derivatives and integration operators.

Considering a motion of an object (particle) in a single dimension (say along an X-axis only), we can express relationships between Displacement D, Speed S and Acceleration A as follows:
D = ∫S (Displacement is equal to Integral of Speed)
A = ∂S (Acceleration is equal to Derivative of Speed)

In general the formulas for Derivatives and Integrals are complicated. For polynomial functions though they are quite straightforward. The Speed when specified as a polynomial function of time can be written as the sum of polynomial terms as follows:
      S = ∑ Ci ti (Speed is equal to sum of polynomial terms in time)
Here Ci are constants and ti are powers of time (t raised to i).

The Integration and Derivation formulas as applied to a polynomial term are as follows:
      ∫ Ci ti = Ci ti+1/(i+1)
      ∂ Ci ti = Ci i ti-1
For example, Integral of 4t2 is: 4t3/3, while its Derivative is: 8t.
Note that Derivatives and Integrals are distributive over addition that is, Integral (Derivative) of a sum of terms is equal to the sum of Integral (Derivative) of terms.

You have to write a simple program to compute the Displacement and Acceleration of an object at specific times, given its Speed as a polynomial function of time. Assume that the object starts from origin and moves only along the X-axis.

#Input specification:

The first line has one integer N, which indicates the number of polynomial terms in the description of Speed.
Next line contains 2*N integers (N pairs) which describes the Speed as a function time. Each pair defines the term. First integer in each pair indicates a constant Ci while second integer is the exponent i of time t. The values for i will never be negative, but they may not be in any particular order.
The last line has a sequence of integers that denotes the times at which the Displacement and Acceleration values have to be evaluated. Number -1, indicating the end of time values, terminates this sequence of integers.

#Output specification:

Your program should print triplets of integer values computed for Displacement, Speed and Acceleration for each time value (specified in the last line of input). Each triplet should be printed on a line of its own. Use double precision arithmetic for all the computation, and while printing results, truncate to get the integer values. (E.g., real values 2.17, 2.30, 2.56 and 2.98 all truncate to 2).


#Sample Input and Output:


Input:

		1
		0 100
		2 -1

Output:

		0 0 0


Input:

		3
		1 0 1 2 -2 1
		0 1 2 3 -1

Output:

		0 1 -2
		0 0 0
		0 1 2
		3 4 4