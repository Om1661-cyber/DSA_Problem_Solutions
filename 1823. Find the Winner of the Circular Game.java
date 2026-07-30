class Solution {
    public int findTheWinner(int n, int k) {

        int winner = 0;   // 0-based winner for n = 1

        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1; // Convert to 1-based indexing
    }
}