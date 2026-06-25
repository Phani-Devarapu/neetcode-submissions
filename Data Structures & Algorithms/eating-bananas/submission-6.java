class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        Integer max = Integer.MIN_VALUE;
        for(int a : piles){
            max=Math.max(a,max);
        }

        int left = 1;
        int right =max;
        int mid=0;
        int ans=max;

        while(left<=right){
         mid = left +(right-left)/2;

            //check this is enough
         int calc = checkHours(mid,piles);

        

            if(calc>h){
                left=mid+1;
            }
            else{
                ans=mid;
                right=mid-1;
            }
        }

        return ans;
        
    }

    public int checkHours(int mid, int[] piles){

        int count=0;

        for(int a : piles){
            if(a<=mid){
                count++;
            }else{
                int b = a/mid;
                int re =a%mid;

                count = count+b;
                if(re>0){
                    count++;
                }
            }
        }
        return count;
    }
}
