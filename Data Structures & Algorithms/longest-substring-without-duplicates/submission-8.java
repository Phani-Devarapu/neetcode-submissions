class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s==null || s.length() ==0){
            return 0;
        }

        int left=0;
        int right =0;
        int result= Integer.MIN_VALUE;
        HashSet<Character> hSet = new HashSet<>();

        while(right < s.length()){

            while(hSet.contains(s.charAt(right))){
                hSet.remove(s.charAt(left));
                left++;
            }
          
          hSet.add(s.charAt(right));
          right++;
          result = Math.max(result,(right-left));
        }

        return result;
        
    }
}
