class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        while(left<right){
            if(right==nums.length){
                break;
            }
            if(nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
                right++;
                  
            }
            else if(nums[left]==nums[right]){
                
                right++;
            }
            // left++;
            // right++ 
        }
        return left+1;
        
    }
}