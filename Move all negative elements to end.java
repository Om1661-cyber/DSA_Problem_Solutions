class Solution {
    public void segregateElements(int[] arr) {
        // code here
       
        int newarr[] = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                newarr[k] = arr[i];
                k++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                newarr[k] = arr[i];
                k++;
            }
        }
       for (int i = 0; i < arr.length; i++) {
            arr[i] = newarr[i];
        }
        
    }
}