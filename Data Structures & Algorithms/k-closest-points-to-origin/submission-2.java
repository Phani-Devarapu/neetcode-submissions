class Solution {
    public int[][] kClosest(int[][] points, int k) {

      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
        int distA = a[0] * a[0] + a[1] * a[1];
            int distB = b[0] * b[0] + b[1] * b[1];
            return Integer.compare(distA, distB);
      });

      for(int[] a : points){
        pq.offer(a);
      }

      int[][] result = new int[k][2];
     for(int i=0; i<k; i++){
      result[i]= pq.poll();
     }
     return result;
        

    }
}
