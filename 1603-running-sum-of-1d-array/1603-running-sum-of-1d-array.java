class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        for (int i = 0; i < length ; i++) {
            if (i == 0) {
                res[i] = nums[i];
            } else {
                res[i] = nums[i] + res[i-1];
            }
        }
        return res;
    }
}