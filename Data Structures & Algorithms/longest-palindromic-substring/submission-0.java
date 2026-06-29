class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int resultLength =0;
        int resultIndex=0;

        boolean[][] dp = new boolean[length][length];

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {

                if(s.charAt(i) == s.charAt(j) && (j-i+1 <=2 || dp[i+1][j-1]==true)){
                   
                    dp[i][j] = true;
                     if(resultLength < (j-i+1)){
                        resultLength=j-i+1;
                        resultIndex=i;
                     }
                }
            }
        }
        return s.substring(resultIndex, resultIndex+resultLength);
    }
}
