class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        char[] result = new char[len1+len2];

        int i = 0;
        int r = 0;

        while(i<len1 && i<len2){
            result[r++] = word1.charAt(i);
            result[r++] = word2.charAt(i);
            i++;
        }

        while(i<len1){
            result[r++] = word1.charAt(i);
            i++;
        }

        while(i<len2){
            result[r++] = word2.charAt(i);
            i++;
        }

        return new String(result);
        
    }
}