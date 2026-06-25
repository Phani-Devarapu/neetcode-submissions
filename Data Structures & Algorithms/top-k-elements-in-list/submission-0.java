class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        List<Integer>[] arr = new List[nums.length];
        Map<Integer,Integer> hMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            arr[i]= new ArrayList<>();
        }
      
        for(int a : nums){

            if(hMap.containsKey(a)){
                hMap.put(a, hMap.get(a)+1);
            }else{
                hMap.put(a,1);
            }
        
        }

        

        for(Map.Entry<Integer,Integer> entry : hMap.entrySet()){
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            List<Integer> temp = arr[val-1];
            temp.add(key);
            arr[val-1]=temp;
        }


         
         int count=0;

         System.out.printf("I am here ");
          System.out.println(arr.length);
        for(int i = arr.length-1;i>=0;i--){  
           List<Integer> temp = arr[i];
           for(Integer n : temp){
            if(k==count){
                return res;
            }
            res[count]=n;
            count++;
           }
            }

      return res;
    }
}
