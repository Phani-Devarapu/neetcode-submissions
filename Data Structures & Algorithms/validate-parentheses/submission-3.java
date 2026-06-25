class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        for(char c : arr){
            switch (c){
            case '(':
                st.push(')');
                break;
            case '{':
                st.push('}');
                break;
            case '[':
                st.push(']');
                break;
            default:
                if(st.empty()){
                    return false;
                }else{
                    if(st.peek()==c){
                        st.pop();
                    }else{
                        return false;
                    }
                }
                break;
        }
        }
    
    return st.isEmpty();       
    }
}
