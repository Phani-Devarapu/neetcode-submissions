class MinStack {

    ArrayList<Integer> alist = new ArrayList<>();
    int min= Integer.MAX_VALUE;

    public MinStack() {
        alist.clear();
    }
    
    public void push(int val) {
        if(min >= val){
            min =val;
        }
        alist.add(val);
    }
    
    public void pop() {
        Integer temp = alist.get(alist.size()-1);
        alist.remove(alist.size()-1); 
        System.out.println("popped element " + temp);
         System.out.println("MIN element " + min);

         if(temp.equals(min)){
            min = Integer.MAX_VALUE;
           for(int i =0; i<alist.size();i++){
            if(alist.get(i)<min){
                System.out.println("min found " + alist.get(i));
                min=alist.get(i);
            }
           }
        }
    }
    
    public int top() {
        return alist.get(alist.size()-1); 
    }
    
    public int getMin() {
        return min;
    }
}
