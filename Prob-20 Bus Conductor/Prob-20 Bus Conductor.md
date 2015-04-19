#MGPT Problem 20

#Bus Conductor

The bus conductor has to issue tickets to a number of passengers on a bus. All the passengers require tickets of the same amount. Each passenger has differing amounts of money in various denominations. However, everyone has the capability to pay for the ticket. You have to write a program to help the conductor decide the sequence in which the passengers should be visited.

Every passenger is visited only once. In each visit, the conductor issues ticket after exchanging money. Note that there might be multiple ways of exchanging money in order to issue ticket. For example, in the first sample input case, when the conductor visits passenger C in the beginning, the conductor has two choices: either accept "1 4" or "2 3" from C. However, accepting "2 3" does not help the conductor in further dealings. A similar situation can arise while dealing with any passenger.

The number of passenger and details of money held by the passengers are input to your program. Each passenger is sequentially labeled A, B and so on. There will not be more than 10 passengers in the bus. Assume that there will be exactly one sequence of visits satisfying the given constraints. Also assume that conductor does not carry any change before he starts issuing tickets. Assume that a passenger will never have more than 5 coins to hold. Similarly the conductor will never have more than 10 coins to hold.

#Input specification:

The first line has an integer C denoting the cost of the ticket.
Next line has an integer N denoting the number of passengers.
Next N lines follow which describe the money held by each passenger. Their structure is as follows:
First, there is an integer H, indicating the number of coins held by the passenger.
This is followed by H integers in the same line denoting the denomination of each coin held. These denominations are listed in ascending order.

#Output specification:

Output should be a sequence of passenger labels indicating the sequence in which the conductor visits the passengers.


#Sample Input and Output:


Input:

		5
		3
		2 2 4
		1 7
		4 1 2 3 4

Output:

		CAB

Input:

		8
		3
		2 10 14
		2 2 6
		2 3 15

Output:

		BAC


