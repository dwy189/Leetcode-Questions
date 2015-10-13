// first solution
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (hs.contains(nums[i])) {
                return true;
            } else {
                hs.add(nums[i]);
            }
        }
        return false;
    }
}

// another "worse" solution using hashmap 
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        boolean flag = false;
        for (int num : map.keySet()) {
            if (map.get(num) >= 2) {
                return true;
            } else if (map.get(num) == 1) {
                flag = false;
            }
        }
        return flag;
    }
}
