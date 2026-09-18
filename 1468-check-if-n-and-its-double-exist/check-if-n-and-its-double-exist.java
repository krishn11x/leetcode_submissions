class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            if(set.contains(arr[i]*2)){
                return true;
            }
            if(arr[i]%2==0&&set.contains(arr[i]/2)){
                return true;
            }
            set.add(arr[i]);
            
        }
        return false;
    }
}

// brute force code
/*class Solution {
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
}*/
