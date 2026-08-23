class Solution {
    public boolean check(int n){
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 2 != 0) return false;

        return check(n/2);
    }
    public boolean isPowerOfTwo(int n) {
       
       return check(n);
       
        // if(n == 0){
        //     return false;
        // }
        // while( n != 1){
        //     if(n % 2 != 0){
        //         return false;
        //     }
        //     n /= 2;
        // }
        // return true;
    }
}