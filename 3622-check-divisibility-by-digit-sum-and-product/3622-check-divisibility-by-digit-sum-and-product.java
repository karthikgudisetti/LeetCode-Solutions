class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int p=1;

        int sum=0;
        while(num!=0){
            int rem=num%10;
            p*=rem;
            sum+=rem;
            num/=10;
        }
        if(n%(p+sum)==0){
            return true;
        }
        return false;
    }
}