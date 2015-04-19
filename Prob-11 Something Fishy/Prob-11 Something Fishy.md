#MGPT Problem 11

#Something Fishy

There are two species of fishes, one bigger and the other smaller in a fish tank. Consider the case when there is only one fish each of the two species. Let us label the bigger fish G and the smaller one D. G has restrictions on movement while D is more agile. G always pursues D, and D tries to evade G. The fish tank for our purpose is a 2D grid of nodes.
This scenario can be visualized as shown in the figure, in which a sample grid with 6 rows and 6 columns is shown.
Fish Tank

The fishes are always situated at the nodes and they move from one node to another according to specific rules. You have to write a program to simulate the movements of fishes for a given duration of time. The simulation proceeds in discrete time intervals.

In a particular time interval, first G moves from one node to another node as per its movement rules given below and then D moves from its current node to another node as per its rules. The movements are completed by G followed by D in each time interval. If in any time interval G moves to a node, which coincides with D's position, then D dies and the simulation ends.

The main criteria which decides the movement of both G as well as D is the distance between them. This distance is the Euclidean distance and is given by the length of the straight line separating the two
For example. the distance d(D,G) ( as shown in the figure above) is computed as follows:

    D's position = 1,3
    G's position = 3,0
    d(D,G) = √((1-3)² + (3-0)²
               = √(4 + 9)
               = √13 ≈ 3.61

Movement of G

    In a time interval, G moves first
    G can move by one node in the horizontal or vertical direction.
    G always tries to make the most attacking move. Most attacking move is that move which minimizes the distance between D and G.
    G always makes a move even if the available move is less attacking than the present move.
    In case of several equally attacking moves, G decides based on the priority ordered as left, top, right, bottom. That is, if there are two possible moves left and bottom, which are equally attacking then G moves to the left.

Movement of D

    In a time interval, D moves second after G's move.
    D can move by one node in the horizontal, vertical or diagonal direction.
    D always tries to make the safest move. Safest move is that move which maximizes the distance between D and G.
    D always makes a move even if the available move is less safe than the present move.
    In case of several equally safe moves, D decides based on the priority ordered as left, left upper diagonal, top, right upper diagonal, right, right lower diagonal, bottom, left lower diagonal. That is, if there are three possible moves left upper diagonal, right lower diagonal and bottom which are equally safe then D moves to the left upper diagonal node.

At no point of time can D and G move to any node beyond the boundary. A time of simulation is given as input and your program should simulate the moves up to the time of simulation specified or up to the time that D dies.

#Input specification:

    First line contains two integers M and N indicating the number of rows and columns in the problem.
    Second line contains two integers X1, Y1 indicating the row number and column number of David at time = 0.
    Third line contains two integers X2, Y2 indicating the row number and column number of Goliath at time = 0.
    The next line contains an integer T the time of simulation.

#Output specification:

    If David survives during the time of simulation then output X3, Y3, X4, Y4, which are the final positions of David and Goliath respectively. Separate each integer by a single white space and end the output with a new line character.
    If David doesn't survive during the time of simulation then output the time T and last known position X5 Y5 at which David is killed. Separate each integer by a single white space and end the output with a new line character.



#Sample Input and Output:

Input: 

        6 6 
        2 4 
        4 2 
        5 
 
Output: 

        0 4 1 4 
 
Input: 

        5 5 
        1 1 
        2 2 
        5 
 
Output: 

        3 0 1 
