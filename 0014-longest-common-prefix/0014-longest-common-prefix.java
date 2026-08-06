class Solution {
    public String longestCommonPrefix(String[] str) {
    //     Arrays.sort(str);
    //     String s="";
    //   for(int i=0;i<str[0].length();i++){
    //     if(str[0].charAt(i) == str[str.length-1].charAt(i)){
    //         s+=str[0].charAt(i);
    //     }
    //     else{
    //         break;
    //     }
    //   }

    //    return s; 
    String s="";
    if(str== null|| str.length==0){
        return "";
    }
    for(int i=0;i<str[0].length();i++){
        char ch= str[0].charAt(i);
        for(int j=1;j<str.length;j++){
            if( i==str[j].length() || str[j].charAt(i)!=ch){
               return  str[0].substring(0,i);
            }
        }
    }
    return str[0];
    }
}