class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
            Integer req = (Integer)(target - nums[i]);
            if(hashMap.containsKey(req)){
                int[] ret = {hashMap.get(req), i};
                return ret;
            }
            hashMap.put(nums[i], i);
        }
        return null;
        
    }
}
