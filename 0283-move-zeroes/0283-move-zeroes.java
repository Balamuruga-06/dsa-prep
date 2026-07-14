class Solution {
    public void moveZeroes(int[] nums) {
        int writeIndex=0;
        int total = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        while(writeIndex > 0 && writeIndex<nums.length){
            nums[writeIndex] = 0;
            writeIndex++;
        }
        

    }
}