class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        max=sum;
        for(int j=k;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[j-k];
            max=Math.max(max,sum);
        }
        max=max/k;
        return max; 
    }
}