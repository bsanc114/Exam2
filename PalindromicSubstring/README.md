# 3 - Palindromic Substrings
Given a string, your task is to count how many palindromic substrings in this string. 

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters. 

Example 1:

        Input: "abc"

        Output: 3

        Explanation: Three palindromic strings: "a", "b", "c".

Example 2:

        Input: "aaa"

        Output: 6

        Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

Note:

        1.	The input string length won't exceed 1000.

*Breaking down the problem:*
        In order to solve this problem, we would want to deal with the simplest case:
        
                Input: "aabb"
                We would have to 
                        1. Get all possible substrings from the String.
                                a | a | b | b | aa | aab | aabb | ab | abb | bb 
                        2. Check each substring to see if it is a palindrome.
                                a (t)| a (t)| b (t)| b (t)| aa (t)| aab (f)| aabb (f)| ab (f)| abb (f)| bb (t)
                        3. Have a sum for those that are palindrome.
                                sum = 6
         
From this observation, we can conclude that there is a lot of repetition. 
One of the main things is that we are iterating 3 times throught the data to get the answer 
because you need to do those steps in order to check how many palindrome substrings there are. 

We could identify the sub-problem being that usuing bruteforce, we would need to go back and 
recalculate the palindromes per range. 

        
 *Solution:*
        From the analysis, we could use Dynamic Programming to solve this problem
        
                        •       We can still conclude that we would need to gather the substrings, and check to see if they are palindrome.
                        •       Sub-problem:
                                        For a index:
                                                Check to see if there is other exisisting palindromes up to that point.
                                                
                                                The sum up to that point will be the sum before that position, added 
                                                
                                                with one to count itself and how many palindromes it found up to that point. 
                                        
                                        
 For the structure to store the sum of palindromes up the range of the index, we will use an array.
 
 Therefore the array would have to be of length of the string, and will store the sum of the index, at the approprate index. 
 
 This is important so when we are calculating the sum of palindromes the previous sum will be added. 
 
 Since we can conclude that as you are iterating through the string, you are taking into account palindromes before the index and the sum.
 
 We are able to conclude that the last index of that array would be the sum of all palindromes in the string. 
 
 In order to carry this out, we would need a method that for each index of the string, will call another method to check if there is palindromes up to that point. 
