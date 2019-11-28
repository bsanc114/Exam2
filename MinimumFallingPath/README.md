# 2 - Minimum Falling Path Sum

Given a square array of integers A, we want the minimum sum of a falling path through A.

A falling path starts at any element in the first row, and chooses one element from each row.

The next row's choice must be in a column that is different from the previous row's column by at most one.

Example 1:

	Input: [[1,2,3],[4,5,6],[7,8,9]]

	Output: 12

Explanation: 

	The possible falling paths are:

	•	[1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]

	•	[2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]

	•	[3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]

	The falling path with the smallest sum is [1,4,7], so the answer is 12.

Note:
 
1.	1 <= A.length == A[0].length <= 100

2.	-100 <= A[i][j] <= 100

*Break down the problem:*

In order to solve this problem, we would want to deal with the simplest case:

	- A 4x4 square of integers.
	
	Before we can get the minimum sum of a falling path we must gather all possible paths. 
	
	- We would need to check the paths from the definition given in the problem
	
		"A falling path starts at any elemenet in the first row, and chooses one element from each row. 
		The next row's choice must be in a column that is different from the previous row's column y at most one."
		
	- So let's take A = [[1,2],[4,5]]
	
	The possible paths are [1, 4], [1, 5], [2, 1], [2, 5]
	
	We could implement this with a simple double for loop checking that checks for each 
	item in the first row for each column for the second row. 

So now, lets go on to the another subproblem:
	
	- let's take B = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
	
	For each item in the first row we would need to see how many paths are available. 
	
	- we could do three loops, to iterate through the square of arrays to check the available paths. 
	
	First Pass: 
	
	first loop will check if 4,5 are valid paths
	
	second loop will check for 4 if 7, 8 & for 5 if 7,8,9 are valid paths
	
	thrid loop ... so on and so forth
	     [1]
	    |    \
	   [4]      [5]
	    | \       \  \  \
	   [7] [8]   [7] [8] [9] 
	   
	Second Pass:
	     	  [2]
	    /      |            \
	   [4]      [5]             [6]
	    | \       \  \  \       |   \
	   [7] [8]   [7] [8] [9]    [8]  [9]
	   
As you could see we do a lot of repetition: 
In the first pass we check if they are all valid, and in pass two we re check if they are valid. 

A simple case of checking the paths is being recalculated everytime you iterate through each row. 
You could use that subproblem to solve other subproblems like in the case above. 

*Solution*
From the analysis of the problem, we could use Dynamic Programming to solve this problem 
	•	For 

	
		
	
	

