class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        int newSum=0;
        if(sum>=10){
            while(sum>0){
                newSum=newSum+sum%10;
                sum=sum/10;   
            }
            if(newSum>=10){
            int secSum=0;
            while(newSum>0){
                secSum=secSum+newSum%10;
                newSum=newSum/10;
            }
            return secSum;
            
        }
            return newSum;
        }
        return sum;
        
    }
}