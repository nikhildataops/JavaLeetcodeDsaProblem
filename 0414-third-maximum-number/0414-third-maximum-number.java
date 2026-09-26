class Solution {
    public int thirdMax(int[] nums) {
        long largest=Long.MIN_VALUE;
        long secLargest=Long.MIN_VALUE;
        long thirdLargest=Long.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==largest || nums[i]==secLargest|| nums[i]==thirdLargest) continue;
            
            if(nums[i]>largest){
                thirdLargest=secLargest;
                secLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secLargest){
                thirdLargest=secLargest;
                secLargest=nums[i];

            }
            else if( nums[i]>thirdLargest){
                thirdLargest=nums[i];
            }
            
            
        }
        if(thirdLargest==Long.MIN_VALUE){
                return (int) largest;
            }
        return (int) thirdLargest;

    }
}
