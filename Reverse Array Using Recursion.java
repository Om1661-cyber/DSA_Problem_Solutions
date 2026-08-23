class Solution {
    public void revUsingRec(int l, int r, int arr[]){
        if(l >= r){
            return ;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        revUsingRec(l+1, r - 1, arr);
    }
    public void reverseArray(int arr[]) {
        // code here
      
           
            revUsingRec(0, arr.length-1, arr);
            
            
        
        
    }
}