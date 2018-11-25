//BFS
import javafx.util.*;
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> list = new HashSet<String>(wordList); // more efficient
        Queue<Pair<String,Integer>> toVisit = new LinkedList<Pair<String,Integer>>();
        
        //endword not within the wordlist
        if (!list.contains(endWord)) {
            return 0;
        }
        int length = 0;
        
        toVisit.add(new Pair<String, Integer>(beginWord, 1));
        
        while(!toVisit.isEmpty()) {
            Pair<String, Integer> p = toVisit.poll();
            String word = p.getKey();
            length = p.getValue();
            char[] chars = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                char temp = chars[i];
                for (char ch = 'a'; ch < 'z'; ch++) {
                    chars[i] = ch;
                    String str = new String(chars);
                    if (str.equals(endWord)) return length + 1;
                    else {
                        if (list.contains(str)) {
                            toVisit.add(new Pair<String,Integer>(str, length + 1)); 
                            list.remove(str);
                        }
                    }
                }
                chars[i] = temp;
            } 
        }
        return 0;
    }  
}


//put the input list into a hashset to avoid TLE
// for loop to get word permutations
//another way to update length: for loop over queue size
//See By A1m:
/*
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int q=0; q < size; q++) {
                char[] cur = queue.poll().toCharArray();
                for (int i=0; i < cur.length; i++) {
                    char tmp = cur[i];
                    for (char chr='a'; chr <= 'z'; chr++) {
                        cur[i] = chr;
                        String dest = new String(cur);
                        if (dict.contains(dest)) {
                            if (dest.equals(endWord)) return level+1;
                            queue.add(dest);
                            dict.remove(dest);
                        }
                    }
                    cur[i] = tmp;
                }
            }
            level++;
        }
        return 0;
    }
*/
