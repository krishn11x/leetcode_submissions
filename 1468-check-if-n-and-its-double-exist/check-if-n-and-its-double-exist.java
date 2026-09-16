class Solution {
    public boolean checkIfExist(int[] arr) {
     for(int i = 0; i<arr.length; i++){
        int dv = arr[i]*2;
        for(int j = 0; j<arr.length; j++){
            if(arr[j]==dv && j!=i){
                return true;
            }
        }
     }   
     return false;
    }
}