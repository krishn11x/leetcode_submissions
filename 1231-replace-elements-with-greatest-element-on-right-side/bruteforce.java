class Solution {
    public int[] replaceElements(int[] arr) {
        //0, 1, 2,3,4,5
        //18
        //17,18,5,4,6,1
        //   i
        //        j

        for(int i = 0; i<arr.length; i++){//i = 1
                int temp = -1; 
            for(int j = i+1; j<arr.length; j++){// j = 3
                
                if(arr[j]>temp){
                    temp = arr[j];
                }  
            }
            arr[i] = temp;
        }
        return arr;
    }
}
