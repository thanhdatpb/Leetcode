package TwoSum_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        //Sử dựng Hashmap đặt key
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for( int i =0; i < nums.length; ++i){
            if (numToIndex.containsKey(target-nums[i])){
                return new int[] {numToIndex.get(target-nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
}
