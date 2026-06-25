class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hSet= new HashSet<>();
        for(int a : nums){
            if(hSet.contains(a)){
                return true;
            }else{
                hSet.add(a);
            }
        }
        return false;
 
    }
}
