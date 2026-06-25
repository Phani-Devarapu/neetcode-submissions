
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hMap = new HashMap<>();

        for(String s : strs){
            String arr = Arrays.toString(getCharMap(s));
            if(hMap.containsKey(arr)){
                List<String> temp = hMap.get(arr);
                temp.add(s);
                hMap.put(arr,temp);
            }else{
                List<String> list=new ArrayList<>();
                list.add(s);
                hMap.put(arr,list);
            }
        }

        return hMap.entrySet()
        .stream()
        .map(e->e.getValue())
        .collect(Collectors.toList());

    }

    public int[] getCharMap(String s){
        int[] arr= new int[26];

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&& c<='z'){
                arr[c-'a']++;
            }
        }
        return arr;
    }
}
