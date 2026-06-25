class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int a :nums){
            if(pq.size()<k){
                pq.add(a);
                continue;
            }
            if(pq.peek() < a){
                if(pq.size()==k){
                    pq.poll();
                    pq.add(a);
                }
            }
        }
        
        return pq.peek();
        
    }
}