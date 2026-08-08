class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> list=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            list.put(arr[i],list.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set= new HashSet<>();
        for(int n:list.values()){
            if(!set.add(n)){
                return false;
            }
        }
        return true;
        
    }
}