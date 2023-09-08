class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] res = new int[accounts.length];
        int z = 0;
        for (int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                res[i] += accounts[i][j];
            }
        }
        for (int x = 0; x < res.length; x++) {
            if (res[x] > z) {
                z = res[x];
            }
        }
        return z;
    }
}