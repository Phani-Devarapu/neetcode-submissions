class Solution {
    public int[] productExceptSelf(int[] nums) {
          int[] res = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        int currentPre = 1;
        for (int i = 0; i < nums.length; i++) {
            currentPre = currentPre * nums[i];
            pre[i] = currentPre;
        }

        int currentPos = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            currentPos = currentPos * nums[i];
            post[i] = currentPos;
        }

        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(post));

        for (int i = 0; i < res.length; i++) {
            int prepro = i == 0 ? 1 : pre[i - 1];
            int postpro = i == res.length - 1 ? 1 : post[i + 1];
            res[i] = prepro * postpro;
        }
        return res;
    }
}

