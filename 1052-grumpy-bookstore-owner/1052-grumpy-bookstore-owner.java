class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
     int unsatisfied=0;
     for(int i=0;i<minutes;i++){
        unsatisfied+=customers[i]*grumpy[i];
     }
     int mun=unsatisfied;
     for(int i=minutes;i<customers.length;i++){
        unsatisfied+=(customers[i]*grumpy[i])-(customers[i-minutes]*grumpy[i-minutes]);
        mun=Math.max(mun,unsatisfied);
     }
     int total=mun;
     for(int i=0;i<customers.length;i++){
        total+=(customers[i]*(1-grumpy[i]));
     }
      return total;
       

        
    }
}