class Solution {
    public int removeDuplicates(int[] nums) {
        // int left=0;
        // int right=1;
        // while(left<right){
        //     if(right==nums.length){
        //         break;
        //     }
        //     if(nums[left]!=nums[right]){
        //         left++;
        //         nums[left]=nums[right];
        //         right++;
                  
        //     }
        //     else if(nums[left]==nums[right]){
                
        //         right++;
        //     }
        // }
        // return left+1;  
        int l =0;
        int r=1;
        int n=nums.length;
        while(r<n){
            if(nums[l]==nums[r]){
                r++;
            }
            else{
                l++;
                nums[l]=nums[r];
                r++;
            }
        }
        return l+1;

    }
}