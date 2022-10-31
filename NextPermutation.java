class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i] >= nums[i+1]) i--;
            else break;
        }
        if (i < 0) {
            int x = 0, y = nums.length-1;
            while (x < y) {
                int temp = nums[x];
                nums[x] = nums[y];
                nums[y] = temp;
                x++; y--;
            }
        } else {
            int j = nums.length-1;
            while (j>=0 && nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            // reverse from i+1
            int x = i+1, y = nums.length-1;
            while (x < y) {
                temp = nums[x];
                nums[x] = nums[y];
                nums[y] = temp;
                x++; y--;
            }
        }
    }
}
