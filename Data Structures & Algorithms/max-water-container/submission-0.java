class Solution {
    public int maxArea(int[] heights) {

        int left =0;
        int right = heights.length-1;
        int res=0;


        while(left < right){

           int containerHeight = Math.min(heights[left], heights[right]);
           int containerWidfth = right-left; 
           int localMax = containerHeight*containerWidfth;
           res = Math.max(res, localMax);

           if(heights[left]<heights[right]){
            left++;
           }else{
            right--;
           }
        }
        return res;
        
    }
}
