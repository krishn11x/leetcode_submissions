class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0,
            sum = 0;
        int dup = 0;
        Map <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<k; i++){
            sum = sum+nums[i];
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i], map.get(nums[i])+1);
            if(map.get(nums[i])>1){
                dup++;
            }
        }
        if(dup == 0){
            max = Math.max(max,sum);
        }
        for(int i = k; i<nums.length; i++){
            int numToAdd = nums[i];
            int numToRemove = nums[i-k];
            
            
            if(!map.containsKey(nums[i])){
                map.put(numToAdd,0);
            }
            
            map.put(numToAdd, map.get(numToAdd)+1);
            
            if(map.get(numToAdd)>1){
                dup++;
            }
            sum = sum+numToAdd;

            if(map.get(numToRemove)>1){
                dup--;
            }
            map.put(numToRemove, map.get(numToRemove)-1);
            sum = sum- numToRemove;
             if(dup == 0){
                max = Math.max(max,sum);
             }
        }
        return max;
    }
}