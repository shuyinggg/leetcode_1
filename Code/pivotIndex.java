class Solution {
    public int pivotIndex(int[] nums) {
        //empty/null case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int sum1 = 0;
        for(Integer integer : nums) {
            sum1 = sum1 + integer;
        } // sum1 is the total of all the nums O(n)
        
        //normal case
        int sum2 = 0;
        int i = 0;
        //sum2 is the total of all the numbers from 0 to i - 1
        for (Integer integer : nums) {
            if (2 * sum2 == (sum1 - integer)) {
                    return i;
            }
            sum2 = sum2 + integer;
             i++;
        }
        return -1;
    }      
}

//Reflection: edge case [-1, -1, 0, 1]
//Similar to solution
