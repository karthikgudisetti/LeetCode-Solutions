class Solution {
    public int totalFruit(int[] fruits) {
      int k=2;
      int maxi=0;
      int j=0;
      int i=0;
      int n=fruits.length;
      Map<Integer,Integer> map= new HashMap<>();
       while(i<n){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        if(map.size()>k){
            map.put(fruits[j],map.get(fruits[j])-1);
            if(map.get(fruits[j])==0){
                map.remove(fruits[j]);
            }
            j++;
        }
        maxi=Math.max(maxi,i-j+1);
        i++;
       } 
       return maxi;

    }
}