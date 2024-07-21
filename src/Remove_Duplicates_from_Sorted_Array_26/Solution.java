package Remove_Duplicates_from_Sorted_Array_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;

        return i;
    }
}