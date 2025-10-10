class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (lastIdx.containsKey(nums[i])) {
                if (i - lastIdx.get(nums[i]) <= k) return true;
            }
            lastIdx.put(nums[i], i);
        }
        return false;
    }
}
