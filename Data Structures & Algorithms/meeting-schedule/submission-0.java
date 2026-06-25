/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

      List<Interval> sorted= intervals.stream()
       .sorted(Comparator.comparingInt(e->e.start))
       .collect(Collectors.toList());

       for(int i =0;i<intervals.size();i++){

        if(i+1 < intervals.size()){
            if(sorted.get(i+1).start <sorted.get(i).end ){
                return false;
            }
        }
       }
       return true;
    }
}
