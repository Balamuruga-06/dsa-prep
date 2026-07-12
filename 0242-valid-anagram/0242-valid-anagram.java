class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] ct = new int[26];
        for(int i=0;i<s.length();i++){
            ct[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            ct[t.charAt(i)-'a']--;
        }
        for(int i=0; i<ct.length;i++){
            if(ct[i]!=0){
                return false;
            }
        }

        return true;
    }
}