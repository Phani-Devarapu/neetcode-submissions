class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hSet = new HashSet<>();
        for(int  a:nums){
            hSet.add(a);
        }

        int max =0;

        for(int a : nums){

            if(!hSet.contains(a-1)){        
               int temp =a;
               int maxLocal=0;
               while(hSet.contains(temp++)){
                  maxLocal++;
                  max= Math.max(max,maxLocal);
              }
            }
        }
        return max;


    }
}
