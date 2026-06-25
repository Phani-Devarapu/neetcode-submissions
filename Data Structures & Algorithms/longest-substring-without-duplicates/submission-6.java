class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] arr= s.toCharArray();
        int left=0;
        int right=0;
        int res=0;

        HashSet<Character> hSet = new HashSet<>();

        for(int i =0;i<arr.length;i++){
           
         if(hSet.contains(arr[i])){

            // for(int j=left;j<right;j++){
            //    if(hSet.contains(arr[i])){
            //      hSet.remove(arr[j]);
            //    }
            //     left++;
            // }
            while(hSet.contains(arr[i])){
                hSet.remove(arr[left]);
                left++;
            }
             hSet.add(arr[i]);

         }else{
            hSet.add(arr[i]);
            right++;
         }

         res=Math.max(res,hSet.size());

        }

        return res;      
    }
}
