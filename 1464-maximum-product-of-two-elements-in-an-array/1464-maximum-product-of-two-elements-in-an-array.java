class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int secLargest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secLargest){
                secLargest=nums[i];
            }
            
        }
        return (largest-1)*(secLargest-1);
    }
}