class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(
            intervals, Comparator.comparingInt((int[] a) -> a[0]).thenComparing((int[] a) -> a[1]));
    
    int[] current = intervals[0];
    int minRemovals=0;

    for(int i =1; i < intervals.length; i++){
      int[] next = intervals[i];

      if(next[0] < current[1]){
        // overlap exist
        minRemovals++;
        current[1]=Math.min(next[1],current[1]);

      }else{
        current =next;
      }
    }
    return minRemovals;
    }
}
