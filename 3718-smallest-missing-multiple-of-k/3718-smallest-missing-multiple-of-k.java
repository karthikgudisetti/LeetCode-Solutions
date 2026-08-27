class Solution {
    public int missingMultiple(int[] nums, int k) {
  
       HashSet<Integer> map= new HashSet<>();
       for(int num:nums){
               map.add(num);
       }
       int multiple=k;
       while(map.contains(multiple)){
        multiple+=k;
       }
       return multiple;
        

        
    }
}