import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                evens.add(nums[i]);
            }
            else{
                odds.add(nums[i]);
            }
        }
        evens.addAll(odds);
        int[] result = new int[nums.length];
        for(int i=0; i<result.length; i++){
            result[i]=evens.get(i);
        }
        return result;
    }
}