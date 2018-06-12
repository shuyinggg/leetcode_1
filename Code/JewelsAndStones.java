class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            char cj = J.charAt(i);
            for (int k = 0; k < S.length(); k++) {
                char cs = S.charAt(k);
                if (cj == cs) {
                    count++;
                }
            }
        }
        return count;
    }
}

//Mistakes:
//1. string.length();
//2. return statement;


/*Best Solution:
class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewelTot = 0;
        for(char stone : S.toCharArray()){
            if(J.indexOf(stone) != -1) jewelTot++;
        }
        return jewelTot;
    }
}

toCharArray() 
- converts this string to a new character array
*/
