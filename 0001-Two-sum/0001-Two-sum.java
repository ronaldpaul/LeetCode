class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] l = {};
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					int a = nums[i] + nums[j];
					if (a == target) {
						l = new int[] { j, i };
						break;
					}
				}
			}
		}
		return l;
	}
}
