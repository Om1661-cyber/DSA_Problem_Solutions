class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0, no = n;
        while(n != 0){
            sum += Math.pow(n % 10,3);
            n/= 10;
        }
        return sum == no ? true : false;
    }
}