class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m+n];
        
        // merge arrays
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        
        Arrays.sort(merged);
        
        int len = m+n;
        if(len % 2 == 1){
            return merged[len/2];   // odd case
        } else {
            return (merged[len/2 - 1] + merged[len/2]) / 2.0; // even case
        }
    }
}
