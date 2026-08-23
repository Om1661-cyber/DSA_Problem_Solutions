
// Using 1 Pointer


class Solution {
    public void revUsingRec(int i, int n, int arr[]){
        if(i == n/2){
            return ;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        
        revUsingRec(i+1, n, arr);
    }
    public void reverseArray(int arr[]) {
        // code here
        
        revUsingRec(0, arr.length, arr);
    }
}


// Using 2 Pointer

// class Solution {
//     public void revUsingRec(int l, int r, int arr[]){
//         if(l >= r){
//             return ;
//         }
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
        
//         revUsingRec(l+1, r - 1, arr);
//     }
//     public void reverseArray(int arr[]) {
//         // code here
      
           
//             revUsingRec(0, arr.length-1, arr);
            
            
        
        
//     }
// }