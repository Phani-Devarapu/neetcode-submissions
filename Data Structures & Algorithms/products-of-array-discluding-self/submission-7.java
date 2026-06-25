class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] result = new int[nums.length];

        for(int i =0; i < nums.length; i++){    
         int product = (i>0)?pre[i-1]:1;
         int temp = product*nums[i];
         pre[i]=temp;
        }
        
        for(int i =nums.length-1; i >=0 ; i--){    
         int product = (i==nums.length-1)?1:post[i+1];
         int temp = product*nums[i];
         post[i]=temp;
        }

        System.out.println(Arrays.toString(pre));
         System.out.println(Arrays.toString(post));


        for(int i =0; i <nums.length; i++){
           
           if(i ==0){
            result[i] = post[1];
            continue;
           }

           if(i == nums.length-1){
            result[i] = pre[i-1];
            continue;
           }

           result[i] = pre[i-1]*post[i+1];
        }

        return result;
    }
}  
