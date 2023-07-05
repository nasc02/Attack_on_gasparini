# Attack_on_gasparini

The great king of Paradis Island is warned that the Titans are organizing an attack!

Titans come in 3 sizes, small meter titans, medium meter titans and large meter titans. Several titans of different sizes are arranging for an attack, and the king needs to build several x meter walls to stop them.

Fortunately the king knows the strategy of the titans, they will attack in sequence, one after another. When a k sized titan encounters a wall one of two situations happens:

If the wall is bigger or the same size as the titan, it destroys k meters of the wall then it tires and dies, so the wall becames k meters lower.
If the wall is smaller than the Titan, it jumps over that wall and moves on to the next one.
The king asks you, the king's advisor, what is the smallest number of walls that need to be built before the attack to stop the attack of the titans.

Input
On the first line will follow 2 integers, n and x, separated by a space, which represent the amount of titans that make up the attack and the size of the walls to be built.

In the second line follows a string of size n, composed of the characters P, M and G, indicating the size (small, medium and large respectively) of the titan. 

In the third line follow 3 integers, p, m and g, which represent the size of a small, medium and large titan respectively.

Output
Based on the problem description, it will print the minimum amount of walls to stop the Titans' attack.

             Input Samples	   
             
     3 20            8 20            4 6
     MPG             MGGPGGGP        GPMP
     3 8 10          3 8 10          3 4 5
  
             Output Samples
             
     2               4               3


this is an exercise from BeeCrowd by Eliton Machado,UDESC.
