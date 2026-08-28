class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int pp[] = new int[26];
        int w[] =new int[26];
        if(p.length()>s.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            pp[p.charAt(i)-'a']++;
            
        }
        for(int i=0;i<s.length();i++){
            w[s.charAt(i)-'a']++;
            if(i>=p.length())
            {
                w[s.charAt(i-p.length())-'a']--;            
                }
        
        if(Arrays.equals(pp,w)){
            list.add(i-p.length()+1);
        }
        }
        return list;

    }
}