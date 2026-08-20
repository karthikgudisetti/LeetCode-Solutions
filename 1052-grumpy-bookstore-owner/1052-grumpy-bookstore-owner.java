class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int usum=0;
      for(int i=0;i<minutes;i++){
        usum+=customers[i]*grumpy[i];
      }
      int msum=usum;
      for(int i=minutes;i<customers.length;i++){
        usum+=(customers[i]*grumpy[i])-(customers[i-minutes]*grumpy[i-minutes]);
        msum=Math.max(msum,usum);
        
      }
      int total=msum;
      for(int i=0;i<customers.length;i++){
        total+=customers[i]*(1-grumpy[i]);
      }
      return total;
       

        
    }
}