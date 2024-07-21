package Romann_to_Integer_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //Duyệt từ trái qua phải
        for (int i = 0; i < arr.length - 1; i++) {
            // Nếu số hiện tại nhỏ hơn số liền sau
            if (map.get(arr[i]) < map.get(arr[i+1])) {
                ans -= map.get(arr[i]);
                // Nếu số hiện tại lớn hơn hoặc bằng
            } else {
                ans += map.get(arr[i]);
            }
        }
        // Cộng toàn bộ giá trị bên trái với số cuối cùng
        ans += map.get(arr[arr.length - 1]);
        return ans;
    }

}
