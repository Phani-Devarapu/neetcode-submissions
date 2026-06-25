
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        List<Pair> pairs = new ArrayList<>();

        for(int i =0;i<position.length;i++){
          pairs.add(new Pair(position[i],speed[i]));
        }
    
        pairs.sort(Comparator.comparingInt(Pair::getFirst).reversed());

        double[] times = new double[position.length];

        for(int i=0;i<pairs.size();i++){
            Pair temp =pairs.get(i);
            times[i]=(double)((double)(target-temp.getFirst())/(double)temp.getSecond());
        }

       // shuld not overtake--

       Stack<Double> st = new Stack<>();

       for(int i =0;i<times.length;i++){

        System.out.println(times[i]);
          if(st.isEmpty()){
            st.push(times[i]);
          }else{
             if(st.peek()>=times[i]){
             }else{
                st.push(times[i]);
             }
          }
       }

       return st.size();    
    }

   static class Pair {
    public final Integer first;
    public final Integer second;
    public Pair(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }
    public int getFirst(){
        return this.first;
    }

    public int getSecond(){
        return this.second;
    }
  }
}



