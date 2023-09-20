class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        int[] data = nums.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] + data[j] < target) {
                    res++;
                }
            }
        }
        return res;
    }
}