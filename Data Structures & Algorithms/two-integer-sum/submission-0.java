class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int temp = nums[i];

           if(hMap.containsKey(target-temp)){
                return new int[]{hMap.get(target-temp),i};
            }else{
                hMap.put(temp,i);
            }
        }
        return new int[2];
    }
}
