class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        while(n>0){
            int tr=0;
            for(int i=0;i<nums.length;i++){
                if(n==nums[i]){
                    tr=1;
                    break;
                }
            }
            if(tr==0){
                return n;
            }
            n--;
        }
        return 0;
    }
}