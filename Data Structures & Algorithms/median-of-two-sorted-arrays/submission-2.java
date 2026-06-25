class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] a; // smaller array
        int[] b;

        if (nums1.length < nums2.length) {
            a = nums1;
            b = nums2;
        } else {
            a = nums2;
            b = nums1;
        }

        int half = (a.length + b.length + 1) / 2;

        int left = 0;
        int right = a.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int secHalf = half - mid;

            int Aleft = mid > 0 ? a[mid - 1] : Integer.MIN_VALUE;
            int Aright = mid < a.length ? a[mid] : Integer.MAX_VALUE;
            int Bleft = secHalf > 0 ? b[secHalf - 1] : Integer.MIN_VALUE;
            int BRight = secHalf < b.length ? b[secHalf] : Integer.MAX_VALUE;


            if (Aleft <= BRight && Bleft <= Aright) {
                if ((a.length + b.length) % 2 != 0) {
                    return Math.max(Aleft, Bleft);
                }
                return (Math.max(Aleft, Bleft) + Math.min(Aright, BRight)) / 2.0;
            } else if (Aleft > BRight) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
    
}
