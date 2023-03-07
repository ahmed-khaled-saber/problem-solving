class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        // Two pointers
        int i=0; int j=nums.length-1;
        // الذي يخل بالترتيب الواقع هو ان يكون للقيمة المطلقة لأقصي رقم سالب أكبر من القيمة المطلقة لأقصي الأرقام الموجبة
        for(int p=result.length-1; p>=0; p--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                result[p] = nums[i]*nums[i];
                i++;
            }
            else{
                result[p] = nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
}
