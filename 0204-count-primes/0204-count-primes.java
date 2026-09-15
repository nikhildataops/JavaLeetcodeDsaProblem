class Solution {
    public int countPrimes(int n) {
        boolean [] primes=new boolean[n];
        Arrays.fill(primes,true);
        Eratosthenes(primes,n);
        int count=0;
        for(int i=2;i<n;i++){
            if(primes[i]==true){
                count++;
            }
        }
        return count;
        
    }
    void Eratosthenes(boolean[] primes,int n){
        for(int i=2;i*i<n;i++){
            if(primes[i]==true){
                for(int j=i*i; j<n;j=j+i){
                    primes[j]=false;
                }
            }
        }
    }
}