class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int c = nums.length - k;
        while(i > c){
            i -- ;
        }
        return nums[i];

        // return nums[nums.length - k];// other wise only this without overall code 
    }
}