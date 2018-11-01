class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        LinkedList<Character> substring = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (substring.contains(c)) {
                int index = substring.indexOf(c);
                for (int k = 0; k < index + 1; k++) {
                    substring.remove();
                }
            }
            substring.add(c);
            if (substring.size() > maxLength) {
                    maxLength = substring.size();
            }
        }
        return maxLength;
    }
}

//Time: O(n^2)
//Think about Hashset, but don't know how to record the sequence;
 ///An alternate method: O(n)  Window
 public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
