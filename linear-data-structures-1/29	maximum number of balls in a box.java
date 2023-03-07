import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumDigits(int num){
        if(num>=0 && num<10){ // num become a single digit
            return num;
        }
        else{
            return num%10 + sumDigits(num/10);
        }
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> boxes_map = new HashMap<>();
        int max = 0;
        for(int i=lowLimit; i<=highLimit; i++){
            int box_num =  sumDigits(i);
            boxes_map.put(box_num, boxes_map.getOrDefault(box_num, 0) + 1);
            max = Math.max(max, boxes_map.get(box_num));
        }
        return max;
    }

}