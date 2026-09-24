class Solution {
    public int missingNumber(int[] nums) {
        int xorSum=0;
        
        for(int i=0;i<nums.length;i++){
            xorSum=xorSum^nums[i];
            xorSum=xorSum^i+1;
        }
        return xorSum;
        
    }
}