class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount=0;
        int Start=0;
        int max_ones = 0;

        for(int end = 0;end<nums.length;end++){
            if(nums[end]==0)
                zeroCount++;

                while(zeroCount > k ){
                    if(nums[Start]==0)
                       zeroCount--;

                       Start++;
                }
                max_ones=Math.max(max_ones,end-Start + 1);  
        }
        return max_ones;
        
    }
}