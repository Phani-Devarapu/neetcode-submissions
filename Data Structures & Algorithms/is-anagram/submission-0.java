class Solution {
    public boolean isAnagram(String s, String t) {

    return Arrays.equals(getCharArr(s),getCharArr(t));

    }

    public int[] getCharArr(String s){
        int[] arr = new int[26];
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                arr[c-'a']++;
            }
        }
        return arr;
    }
}
