import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int target = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int x: nums) {
            int count = map.getOrDefault(x, 0);
            count++;
            if(count - 1 == target){
                result.add(x);
                if(result.size() == 2){
                    break;
                }
            }
            map.put(x, count);
        }
        return result;
    }
}
