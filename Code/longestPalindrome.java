class Solution {
    //Brute Force: check every possible combinations
    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        } else if (s.isEmpty() ||s.length() == 1){
           return s;
        } else {
            String ans = "";
            for (int i = 0; i < s.length();i++) {
                int tempi = i;
                for (int j = s.length() - 1; j > i; j--) {
                    tempi = i;
                    //save time if the input is large
                    if (j - i + 1 <= ans.length()) {
                        break;
                    }
                    String temp = s.substring(tempi, j + 1);
                    int tempj = j;
                    while (tempj >= 0 && tempi < s.length() && (s.charAt(tempi) == s.charAt(tempj))) {
                        tempi++;
                        tempj--;
                        if (tempj <= tempi && ans.length() < temp.length()) {
                            ans = temp;
                            break;
                        }
                    }   
                }
            }
            if (ans == "" && s.length() != 0) {
                ans = s.substring(0,1);
            }
          return ans;  
        }
    
    }
}   

//Palindrome 回文
// single char, but two chars are not
// str.length()
// "" length 0
//str.substring(beginIndex, endIndex) 
//Ex: str = "abc" str.substring(0,2) output: "ab" 
