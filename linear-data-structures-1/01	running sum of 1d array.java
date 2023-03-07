class Solution {
    public int[] runningSum(int[] nums) {
        int[] running_sum = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            if(i-1 < 0){
                running_sum[i] = nums[i];
            }
            else{
                running_sum[i] = nums[i] + running_sum[i-1];
            }
        }
        return running_sum;
    }
}