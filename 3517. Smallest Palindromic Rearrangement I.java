class Solution {
    public String smallestPalindrome(String s) {
       int[] freq = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = '\0';

        // Build left half
        for (int i = 0; i < 26; i++) {
            int half = freq[i] / 2;

            for (int j = 0; j < half; j++) {
                left.append((char) ('a' + i));
            }

            if ((freq[i] & 1) == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append(left);

        if (middle != '\0') {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString(); 
    }
}