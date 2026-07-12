class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int writeIndex = 0;
        for(int i=0;i<chars.length;i++){
            if(Character.isLetterOrDigit(chars[i])){
              chars[writeIndex] = Character.toLowerCase(chars[i]);
              writeIndex++;
            }
        }
        int left=0;
        int right=writeIndex-1;
        while(left<right){
            if(chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}