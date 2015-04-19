#MGPT Problem 18

#Water Juggles

In the arid deserts of Akrathoum there is an acute scarcity of water. The king has proclaimed rationing of water. There is also a royal decree that no water should be wasted. The minister was given this task of rationing. The palace has some holy jars whose capacity (the maximum amount of water that a jar can hold) is known. So the king asked the minister to use these jars for rationing the water. The king wanted exactly R liters of water to be measured and given to all the people. The only operation allowed is transferring water from one jar to the other. You are required to devise a sequence of transfers, which will result in one of the jars containing exactly R litres of water.

Consider the first sample input. There are three jars of 8, 5, and 3 litres. Initially the 8 litres jar is full, while the other two are empty. 4 litres of water needs to be measured. So one can arrive at it in the following manner as shown in the table below by transferring water from one jar to another. The values in the second, third and fourth columns indicate the volume of water in the respective jar at the end of each step.

| Step Number | 8 litre jar | 5 litre jar | 3 litre jar | 
|-------------|-------------|-------------|-------------|
| Initial     | 8           |   0         | 0           |
|1 			  |	3           |	5         |	0           |
|2            |	3           |	2         |	3           |
|3            |	6           |	2         |	0           |
|4            | 6           |   0         |	2           |
|5            |	1           |	5         |	2           |
|6            | 1           |	4         |	3           |

The table above shows the minimum number of transfers required to measure 4 litres of water. There may be other sequences, which also result in the measurement of exactly 4 litres, but they will all require 6 transfers or more.
NOTE: You are allowed a maximum of six (6) transfers to do the job.

#Input specification:

The first line contains an integer, N, the number of jars. (1 =< N =< 4)
The next N lines contains 2 integers each
V, the volume of the jar (V > 0).
W, the volume of water in the jar initially. (W >= 0)
The last line contains an integer R, the amount of water to be measured. If Vm is the volume of the largest jar, then R =< Vm.

#Output specification:

You have to print the minimum number of transfers required. It is guaranteed that the number of transfers will never exceed six. Also, you can assume that there will always be a sequence of transfers, which will measure R litres of water.

#Sample Input and Output:

Input:

		3
		8 8
		5 0
		3 0
		4

Output:

		6