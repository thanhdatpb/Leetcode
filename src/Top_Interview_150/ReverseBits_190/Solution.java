package Top_Interview_150.ReverseBits_190;

public class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; ++i)
            if ((n >> i & 1) == 1)
                ans |= 1 << 31 - i;

        return ans;
    }
}
