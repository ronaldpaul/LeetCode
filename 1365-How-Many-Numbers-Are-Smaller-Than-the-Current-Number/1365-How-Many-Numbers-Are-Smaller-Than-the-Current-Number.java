class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp = 0, length = nums.length;
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            temp = 0;
            for (int j = 0; j < length; j++) {
                    if (nums[i] > nums[j]) {
                        temp++;
                    }
            }
            res[i] = temp;
        }
        return res;
    }
}
