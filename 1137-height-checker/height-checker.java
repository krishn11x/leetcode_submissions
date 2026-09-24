class Solution {
    public int heightChecker(int[] heights) {
        
        int count = 0;
        int []result = heights.clone();
        Arrays.sort(result);
        for(int i = 0 ; i<result.length; i++){
            if(result[i]!=heights[i]){
                count ++;
            }
        }
        return count;
    }
}