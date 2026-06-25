class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left =0;
        int right = nums.length-1;

        while(left<right){
            int temp = nums[left]+ nums[right];

            if(temp == target){
                return new int[]{left+1, right+1};
            }

            if(temp > target){
                right--;
            }else{
                left++;
            }
        }

        return new int[2];

        
    }
}
