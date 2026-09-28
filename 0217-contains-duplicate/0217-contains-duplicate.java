class Solution {
    public boolean containsDuplicate(int[] nums) {
        // T.C --> O(n)  S.C-->O(n)
        HashSet<Integer> freq=new HashSet<>();
        for(int num:nums){
            if(!freq.add(num)){
            return true;
            }
        }
        
        return false;
    

        
        
        
        
    }
}