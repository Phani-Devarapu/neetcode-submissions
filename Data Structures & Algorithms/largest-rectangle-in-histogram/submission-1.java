class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int maxArea= Integer.MIN_VALUE;

        for(int i = 0; i<= heights.length;i++){
             while(!st.isEmpty() && (i==heights.length || heights[st.peek()] >= heights[i])){
              int index = st.pop();
              int len=heights[index];
              int wid=st.isEmpty() ? i : i - st.peek()-1;
              maxArea = Math.max(maxArea,(len*wid));
            }
            st.push(i);
        }
        return maxArea;

    }
}