// O(N^2) solution
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index1 = 0;
        int index2 = 0;
        for (index1 = 0;index1 < nums.length;index1++) {
            for (index2 = index1 + 1; index2 < nums.length; index2++) {
                if (nums[index2] == target - nums[index1]) {
                    result[0] = index1+1;
                    result[1] = index2+1;
                    break;
                }
            }
        }
        return result;
    }
}

// use a hashmap to reach O(N) (posted later)
