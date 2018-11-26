# leetcode_1
# List

+ [771 Jewels and Stones](#771-Jewels-and-Stones)
+ [724 Find Pivot Index](#724-Find-Pivot-Index)
+ [804 Unique Morse Code Words](#804-Unique-Morse-Code-Words)
+ [206 Reverse Linked List](#206-Reverse-Linked-List) (LinkedList)
+ [141 Linked List Cycle](#141-Linked-List-Cycle) (LinkedList)
+ [2 Add Two Numbers](#2-Add-Two-Numbers)
+ [3 Longest Substring Without Repeating Characters](#3-Longest-Substring-Without-Repeating-Characters)
+ [5 Longest Palindromic Substring](#5-Longest-Palindromic-Substring) (String Manipulation)
+ [1 Two Sum](#1-Two-Sum) (Array & Hash Table)
+ [111 Minimum Depth of Binary Tree](#111-Minimum-Depth-Of-Binary-Tree) (Binary Tree, BFS, DFS)
+ [146 LRU Cache](#146-LRU-Cache) (Design)
+ [127 Word Ladder](#127-Word-Ladder) (BFS)
+ [202 Happy Number](#202-Happy-Number)


# Problems
## 771 Jewels and Stones 

**Problem Link**:   
[https://leetcode.com/problems/jewels-and-stones/description/](https://leetcode.com/problems/jewels-and-stones/description/)

**Description**:    
Find how many times each character in String1 appears in String2. (chars in String1 are distinct) 

**Solution**:   
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/JewelsAndStones.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/JewelsAndStones.java)

**Other**:  
Time: O(n^2)

## 724 Find Pivot Index 

**Problem Link**:   
[https://leetcode.com/problems/find-pivot-index/description/](https://leetcode.com/problems/find-pivot-index/description/)

**Description**:    
Compute the left and right sums, then give the pivot index.

**Solution**:   
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/pivotIndex.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/pivotIndex.java)

**Other**:  
Time: O(n)

## 804 Unique Morse Code Words

**Problem Link**:   
[https://leetcode.com/problems/unique-morse-code-words/description/](https://leetcode.com/problems/unique-morse-code-words/description/)

**Description**:    
Represent words in Morse code.

**Solution**:   
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/uniqueMorseRepresentations.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/uniqueMorseRepresentations.java)

**Other**:  
Time: O(n) 

## 206 Reverse Linked List  

**Problem Link**:   
[https://leetcode.com/problems/reverse-linked-list/description/](https://leetcode.com/problems/reverse-linked-list/description/)

**Description**:           
Reverse a singly LinkedList.

**Solution**:   
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/reverseList.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/reverseList.java)

**Other**:  
Time: O(n) iteratively 
Not recursively

## 141 Linked List Cycle  

**Problem Link**:      
[https://leetcode.com/problems/linked-list-cycle/description/](https://leetcode.com/problems/linked-list-cycle/description/)

**Description**:       
Detect a cycle in a singly-linked list

**Solution**:        
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/hasCycle.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/hasCycle.java)

**Other**:        
Time: O(n)
Space: O(1) doesn't require extra space

## 2 Add Two Numbers 

**Problem Link**:       
[https://leetcode.com/problems/add-two-numbers/description/](https://leetcode.com/problems/add-two-numbers/description/)

**Description**:     
Two Non-negative integers are represnted in linkedlists. Find the sum and also return the result as a linkedlist. The number is stored in the reverse order. (Ex 234  4->3->2)

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/addTwoNumbers.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/addTwoNumbers.java)

**Other**:      
Time: O(n)
Space: O(1) doesn't require extra space

## 3 Longest Substring Without Repeating Characters 

**Problem Link**:       
[https://leetcode.com/problems/longest-substring-without-repeating-characters/description/](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

**Description**:     
Given a string, find the length of the longest substring without repeating characters. (By "substring" all the chars should be adjacent in the original string)

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/lengthOfLongestSubstring.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/lengthOfLongestSubstring.java)

**Other**:      
Time: O(n^2)   

## 5 Longest Palindromic Substring   

**Problem Link**:       
[https://leetcode.com/problems/longest-palindromic-substring/description/](https://leetcode.com/problems/longest-palindromic-substring/description/)  

**Description**:     
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000 (Stress Test).
```
Tests:
Edge/Null Case: Null - not specify
                Edge - one char only; same chars
Stress Test: 1000 same chars; 500 same chars + 500 same chars
```
 

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/longestPalindrome.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/longestPalindrome.java)

**Other**:      
Time: O(n^3) A very naive solution. ~700ms

## 1 Two Sum      

**Problem Link**:       
[https://leetcode.com/problems/two-sum/description/](https://leetcode.com/problems/two-sum/description/)

**Description**:     
Given an array of integers, return indices of the two numbers such that they add up to a specific target. (EXACTLY one solution)
Input array is not sorted and contains negative and duplicate elements.

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/twoSum.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/twoSum.java)

**Other**:      
Time: O(n^2)  Brute Force  
```
Some edge case:
target = 0, array = [0, 3, 4, 5]
```

## 111 Minimum Depth of Binary Tree 

**Problem Link**:       
[https://leetcode.com/problems/minimum-depth-of-binary-tree/](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

**Description**:     
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
(If the tree contains only one node, depth = 1)

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/minDepth.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/minDpeth.java)

**Other**:      
Time: O(n) 
Recursion -- Drawback: The Binary Tree maybe very unbalanced.
To do: BFS and DFS

## 146 LRU Cache 

**Problem Link**:       
[https://leetcode.com/problems/lru-cache](https://leetcode.com/problems/lru-cache)

**Description**:     
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put. 

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1. 

put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.   

key, value -- all integers

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/LRUCache.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/LRUCache.java)     

Alternate solution:
[https://leetcode.com/problems/lru-cache/discuss/45911/Java-Hashtable-%2B-Double-linked-list-(with-a-touch-of-pseudo-nodes)](https://leetcode.com/problems/lru-cache/discuss/45911/Java-Hashtable-%2B-Double-linked-list-(with-a-touch-of-pseudo-nodes))

**Other**:      
Time: ? 
get O(1)
put O(1), if the key exists, remove and put O(n).
Use Class LinkedHashMap.

In order to make all these to operations O(1), need HashMap and DoubleLinkedList to track the entering and leaving sequence. HashMap is an array of linkedlists.

```
Hash    | LinkedList
---------------------------
key     | prev data next hnext -> prev data next hnext -> null
             
key     | prev data next hnext -> null
        
```
prev and next are fields in doublelinkedlist which link all the item in the HashMap, hnext points to the next element in the same hashmap linkedlist.

## 127 Word Ladder 

**Problem Link**:       
[https://leetcode.com/problems/word-ladder/](https://leetcode.com/problems/word-ladder/)

**Description**:     
Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord.

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/ladderLength.java](https://github.com/shuyinggg/leetcode_1/blob/master/Code/ladderLength.java)

**Other**:      
To do: Time Analysis

## 202 Happy Number 

**Problem Link**:       
[https://leetcode.com/problems/happy-number/](https://leetcode.com/problems/happy-number/)

**Description**:     
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

**Solution**:            
[https://github.com/shuyinggg/leetcode_1/blob/master/Code/isHappy.py](https://github.com/shuyinggg/leetcode_1/blob/master/Code/isHappy.py)

**Other**:      
while loop
convert the big integera into string/list
