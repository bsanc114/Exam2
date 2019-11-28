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
                        
         From this analysis we could notice that there is a lot of redundant checking when a single character is palindrome. 
         
         
        
 *Solution:*
  For the solution, 
