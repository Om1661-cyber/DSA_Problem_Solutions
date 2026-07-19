class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1 ,maxwater = 0;
     
     while(left < right){
        int width = right - left;
        int ht = Math.min(height[left],height[right]);
        int contain = width * ht;
        maxwater = Math.max(maxwater,contain);

        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
    

    }
    return maxwater;  
    }
}