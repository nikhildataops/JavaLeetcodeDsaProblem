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
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int i:nums){
            if(freq.get(i)>1){
                return i;
            }
        }
        
        return -1;
    }
}