class Solution {
    // O(log(min(m, n))) time, O(1) space
    // https://github.com/mission-peace/interview/blob/master/src/com/interview/binarysearch/MedianOfTwoSortedArrayOfDifferentLength.java
    // https://www.youtube.com/watch?v=LPFhl65R7ww
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2. length) return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int secondArrayIndex = (m + n + 1) / 2 - mid;
            int maxLeftNums1 = mid > 0 ? nums1[mid - 1] : Integer.MIN_VALUE;
            int minRightNums1 = mid < m ? nums1[mid] : Integer.MAX_VALUE;
            int maxLeftNums2 = secondArrayIndex > 0 ? nums2[secondArrayIndex - 1] : Integer.MIN_VALUE;
            int minRightNums2 = secondArrayIndex < n ? nums2[secondArrayIndex] : Integer.MAX_VALUE;
            if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
                } else {
                    return Math.max(maxLeftNums1, maxLeftNums2);
                }
            } else if (maxLeftNums1 > minRightNums2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0.0;
    }
}
