class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1){return 0;}
        int ops = 0;
        int tmp = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                tmp = (nums[i] - nums[i+1]);
                nums[i+1] += tmp+1;
                ops+=tmp+1;
            }
            else if(nums[i] == nums[i+1]){
                tmp=0;
                ops+=tmp+1;
                nums[i+1]+=tmp+1;
            }
            // System.out.println("increments: "+tmp);
            // System.out.println("total increments: "+ops);
            // System.out.println("====");
        }
        return ops;
    }
}