class TimeMap {

    Map<String,List<String>> keyVals = new HashMap<>();
    Map<String,List<Integer>> keyTimes = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String val, int timestamp) {
        if(keyVals.containsKey(key)){
            List<String> arr = keyVals.get(key);
            arr.add(val);
            keyVals.put(key,arr);
           List<Integer> times= keyTimes.get(key);
           times.add(timestamp);
            keyTimes.put(key,times);
        }else{
            List<String> arr = new ArrayList<>();
            arr.add(val);
            keyVals.put(key,arr);

             List<Integer> times = new ArrayList<>();
             times.add(timestamp);
            keyTimes.put(key,times);
        }
    }
    
    public String get(String key, int timestamp) {
        int resultIndex = -1;
            if(keyVals.containsKey(key)){    
                List<Integer> list = keyTimes.get(key);
                Integer[] arr = list.stream().toArray(Integer[]::new);

                if(arr.length ==1){
                    if(arr[0]<=timestamp){
                        return keyVals.get(key).get(0);
                    }else{
                        return "";
                    }
                }
                int left =0;
                int right = arr.length-1;
                
                while(left <= right){
                    int mid = left+ (right-left)/2;
                    if(arr[mid] > timestamp){
                        right = mid-1;
                    }else if(arr[mid]<=timestamp){
                        resultIndex = mid;
                        left = mid+1;
                    }
                } 
            }
            return resultIndex==-1? "":keyVals.get(key).get(resultIndex);
    }
}
