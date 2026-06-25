class Solution {
    public int evalRPN(String[] tokens) {

        List<String> ops = new ArrayList<>();
        ops.add("+");
        ops.add("-");
        ops.add("*");
        ops.add("/");

        Stack<Integer> st = new Stack<>();
        Integer res=0;

        for(String a : tokens){
            if(ops.contains(a)){
                if(a.equals("+")){
                   st.push(st.pop()+st.pop());
                }else if(a.equals("-")){
                    int  b = st.pop();
                    int c = st.pop();
                    st.push(c-b);
                }else if(a.equals("*")){
                    st.push(st.pop() * st.pop());
                }else{
                    int e= st.pop();
                    int f =st.pop();
                    if(e!=0){
                        st.push(f/e);
                    }
                }

            }else{
                st.push(Integer.valueOf(a));
            }
        }
        return st.pop();
    }
}
