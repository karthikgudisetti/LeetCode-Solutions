class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int[] s1f =new int[26];
        int[] s2f= new int[26];
        for(int i=0;i<s1.length();i++){
            s1f[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            s2f[s2.charAt(i)-'a']++;
            if(i>=s1.length()){
                s2f[s2.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(s1f,s2f)){
                return true;
            }
        }
        return false;
    
        
    }
}