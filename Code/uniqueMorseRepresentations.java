class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] output = new String[100];
        int i = 0;
        
        for (String word : words) {
            boolean status = true;
            String code = "";
            for (char c : word.toCharArray()) {
                code = code + getMorseCode(c);
            }
            
            if (i != 0) {
                for (int k = 0; k < i; k++) {
                    String s = output[k];
                    if (code.equals(s)) {
                        status = false;
                    }
                }
            }
            if (status) {
                output[i] = code;
                i++;
            }
        }
        return i;
    }
    
    private static String getMorseCode(char c){
       String[] morseCode = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                                        "---", ".--.", "--.-" ,".-." ,"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        return morseCode[c - 97];
    }
}
