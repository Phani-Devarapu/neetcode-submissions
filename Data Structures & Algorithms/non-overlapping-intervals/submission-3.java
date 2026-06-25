class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int count =0;
        Arrays.sort(intervals, (a,b)->{
          int c=  Integer.compare(a[0],b[0]);
          if(c ==0){
            return Integer.compare(a[1],b[1]);
          }else{
            return c;
          }
        });
        int[] current = intervals[0];
        List<int[]> list = new ArrayList<>();

        for(int i =1; i < intervals.length ; i++){
         int[] next = intervals[i];

         if(current[1] > next[0]){
            //overlap
            count++;
            if (current[1] > next[1]) {
                    current = next;
                }
         }else{
          //  list.add(next);
            current=next;
         }

        }    
       // list.add(current);
        return count;    
    }
}
