class Solution {
    public int[] replaceElements(int[] arr) {
        //0, 1, 2,3,4,5
        //18  6 6 6 1 -1
        //17,18,5,4,6,1
        //          i
        //              j

        for(int i = 0; i<arr.length; i++){//i = 5
                int temp = -1; // temp = 18/ -1/ 5/ 6 / -1/ 4/ 6/ -1/ 6/ -1/ 1/ -1
            for(int j = i+1; j<arr.length; j++){// j = 6
                
                if(arr[j]>temp){
                    temp = arr[j];
                }  
            }
            arr[i] = temp;
        }
        return arr;
    }
}
