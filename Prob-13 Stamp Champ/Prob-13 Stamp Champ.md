#MGPT Problem 13

#Stamp Champ

In a post office, an official is given charge of issuing the stamps to requesting customers. Each customer comes with an envelope. Based on its weight and destination, the official decides the amount of stamps to be pasted on the envelope.
You have to write a program to help this official to decide which stamps are issued to customers. Your program should issue minimum number of stamps, which exactly sums up to the required amount. Various denominations of stamps available with the official are given as an input to your program.
Assume that there is an unending supply of stamps for each denomination. Also, assume that the official always fulfills the customer's requests for stamps.

#Input specification:

First line has an integer n denoting the number of denominations available.
Next line has n integers, each denoting a stamp denomination. These values are given in ascending order.
Next line will be an integer c denoting the number of customers.
Next line has c integers, each denoting the total amount of stamps requested by each customer.

#Output specification:

Output should be a single number indicating total number of stamps issued to customers.


#Sample Input and Output:


Input:

		5
		1 4 5 7 10
		3
		6 12 32

Output:

		8