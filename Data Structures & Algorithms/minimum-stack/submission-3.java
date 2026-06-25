class MinStack {

 
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            minStack.push(val);
        } else {
            if (val <= minStack.peek()) {
                minStack.push(val);
            }
            stack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            Integer pop = stack.pop();
            if(Objects.equals(pop, minStack.peek())) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return 0;
    }

    public int getMin() {
       if(!stack.isEmpty()){
           return minStack.peek();
       }
       return 0;
    }
}
