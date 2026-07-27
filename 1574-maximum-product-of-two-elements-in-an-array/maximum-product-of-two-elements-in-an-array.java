class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int sum=0;
        int first=nums[nums.length-1];
        int second=nums[nums.length-2];
        sum=(first-1)*(second-1);
        return sum;
    }
}