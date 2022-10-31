class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int j = 0;
        int ans = 0;
        for (int i=0;i<nums.length; i++) {
            if (nums[i] != val) {
                ans++;
                swap(nums, i, j);
                j++;
            }
        }
        return ans;
    }
    private void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
