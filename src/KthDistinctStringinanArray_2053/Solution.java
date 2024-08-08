package KthDistinctStringinanArray_2053;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counter = new HashMap<>();
        for(String x : arr){
            counter.put(x, counter.getOrDefault(x, 0) + 1);
        }
        for(String x : arr){
            if(counter.get(x) == 1){
                k--;
                if (k == 0){
                    return x;
                }
            }
        }
        return "";
    }
}
