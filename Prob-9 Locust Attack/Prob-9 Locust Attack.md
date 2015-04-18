#MGPT Problem 9

#Locust attack!

A group of locust are ready to attack a paddy field. The field is a two dimensional matrix with each element representing a plant. The field is bounded by an electric fence. So any locust crossing the boundary of the field gets killed. The insects can move only in a particular direction to infect the crops. The movement of the insects is defined as:
	
| A | B | C |
|---|---|---|
| D |   | E |
| F | G | H |

A: North West 

B: North

C: North East

D: West

E: East

F: South West

G: South

H: South East

At a given unit of time the insect can infect only a single plant. With each non-infected plant the locust infects, its strength increases by one unit. At a given time the number of insects jumping on a plant can be more than one, in this case the strongest of the insects survives and the others get killed. If more than one insect come out to be strongest then all those insects survive and rest get killed. All surviving insects each increase their strength by one unit if the plant was previously uninfected.
You are required to find out the number of plants that have NOT been infected and the number of surviving locust(s) at the end of the simulation.

Each insect starts off with a strength of zero units.

#Input specification:

The first line of input gives the size (M x N) of the paddy field. Both M and N are integers and their value will not exceed 6.
The next line of input will be the time of simulation.
The next line of input will be the number of locusts, L (< 15), which are going to attack the field.
Next L lines will have the starting position of the locusts in the field, their starting time and their directional movement.

The starting position will be given as zero-based row, column values.

#Output specification:

The output will be count of number of uninfected plants and the number of surviving locust(s) separated by a blank space. The output will be terminated by a newline.

#Sample Input and Output:

Input:

		6 6
		25
		5
		2 3 10 H
		1 1 5 E
		1 2 6 D
		3 3 18 A
		4 5 2 E

Output:

		25 0