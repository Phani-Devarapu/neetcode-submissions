class Solution {
    public boolean isPalindrome(String s) {

        if(s ==null || s.length()<1){
            return true;
        }
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i =0;
        int j = s.length()-1;
        
        while(i<j){
           
        //    if(!(s.charAt(i) >='a' && s.charAt(i)<='z')){
        //     i++;
        //    }
        //     if(!(s.charAt(j) >='a' && s.charAt(j)<='z')){
        //     j--;
        //    }
           

            if(s.charAt(i) != s.charAt(j)){
               System.out.println(s.charAt(i) + " "+s.charAt(j));
                return false;
            }
             i++;
             j--;
           
        }
        return true;
        
    }
}
