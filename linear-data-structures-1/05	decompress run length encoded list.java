import java.util.ArrayList;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        // dynamiclly extend and shrink in demand.
        ArrayList<Integer> wrapped_result = new ArrayList<>();

        for(int i=0; i<nums.length; i += 2){
            int freq = nums[i];
            int val  = nums[i+1];
            
            for(int j=0; j<freq; j++){
                wrapped_result.add(val);
            }
        }
        int[] result = new int[wrapped_result.size()];
        for(int i=0; i<result.length; i++ ){
            result[i] = wrapped_result.get(i);
        }

        return result;
    }
}