/*Questions:
sorted?  ---No
non negative? ---No
size of inputs?
null inputs? ---No
output sorted? ---Yes
duplicates? --- Yes
*/
/* edge case:
[0,3,4,0] t = 0;

/* declare or initialize an array
int[] myIntArray = new int[3];
int[] myIntArray = {1,2,3};
int[] myIntArray = new int[]{1,2,3};
*/

/* Syntax Errors:
Array:
nameOfArray.length
String:
nameOfString.length()
Math:
add Math.min/max
*/

//Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0,0};
        for (int i = 0; i < nums.length; i++) {
                int num = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if ( nums[j] == num) {
                        result[0] = Math.min(i,j);
                        result[1] = Math.max(i,j);
                        return result;
                    }
                }
            }
           return result; 
        }
       
    }

/* Best Solution: Key idea: mapping the array to its index using hash table Time and Space: O(n)
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
*/

