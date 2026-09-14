class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,
            i = 0,
            max = 0;
        while(i< nums.length){
            if(nums[i]==0){
                count = 0;
            }else {
                count++;
                if(count>=max){
                    max=count;
                }
            }
            i++;
        }
        return max;
    }
}