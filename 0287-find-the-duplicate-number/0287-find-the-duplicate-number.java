class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer,Integer> freq=new HashMap<>();
        // for(int num:nums){
        //     freq.put(num,freq.getOrDefault(num,0)+1);
        // }
        // int freqKey=0;
        // for(int key:freq.keySet()){
        //     int currentKey=key;
        //     int currentKeyFreq=freq.get(key);
        //     if(currentKeyFreq>1){
        //         freqKey=currentKey;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==freqKey){
        //         return nums[i];
        //     }
        // }
        // return -1;


        // T.C--> O(n) && S.C--> O(n)
        // HashMap<Integer,Integer> freq=new HashMap<>();
        // for(int num:nums){
        //     freq.put(num,freq.getOrDefault(num,0)+1);
        // }
        // for(int i:nums){
        //     if(freq.get(i)>1){
        //         return i;
        //     }
        // }
        
        // return -1;
        //T.C--> O(n) && S.C-->O(1)
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];//+1
            fast=nums[nums[fast]];//+2
        }while(slow!=fast);
        
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];//+1
            fast=nums[fast];//+1
        }
        return slow;
    }
}