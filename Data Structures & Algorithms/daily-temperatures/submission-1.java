class Solution {
    public int[] dailyTemperatures(int[] temps) {

        if(temps.length <1){
            return temps;
        }

        Stack<Integer> st = new Stack();
        int[] res = new int[temps.length];

        for(int i =temps.length-1;i>=0;i--){
            if(st.isEmpty()){
               res[i]=0;
               st.push(i);
            }else{
                while(!st.isEmpty() && temps[st.peek()]<=temps[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    res[i]=0;
                }else{
                    res[i]=st.peek()-i;
                }
                st.push(i);
            }
        }
        return res;    
    }
}
