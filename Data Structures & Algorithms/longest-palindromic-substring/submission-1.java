class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int left = 0;
        int index = 0;
        int max = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < length; i++) {
            int odd = getLength(s, i, i);
            int even = getLength(s, i, i + 1);

            int len = Math.max(odd, even);

            if (len > max) {
                max = Math.max(len, max);
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int getLength(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
