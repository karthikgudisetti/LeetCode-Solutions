class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int min=Integer.MAX_VALUE;
          int boat=0;
          Arrays.sort(people);
    
    while(l<=r){
        if(people[l]+people[r]<=limit){
            boat++;
            l++;
            r--;
        }
        else if(people[l]+people[r]>limit){
            boat++;
            r--;
        }

    }
    return boat;

    
    }
}