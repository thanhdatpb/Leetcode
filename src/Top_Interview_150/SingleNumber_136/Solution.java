package Top_Interview_150.SingleNumber_136;


public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (final int num : nums)
            ans ^= num;

        return ans;
    }
}