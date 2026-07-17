class Solution {
    public int missingNumber(int[] nums) {
        
        int size = nums.length;
        int total = (size*(size+1))/2;

        int arrTotal=0;
        for(int i=0;i<size;i++){
            arrTotal+=nums[i];
        }

        return total - arrTotal;
        
    }
}