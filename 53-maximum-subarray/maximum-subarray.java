class Solution {
    public int maxSubArray(int[] nums) {
        int psum=0;
        int submax=nums[0];
        for(int i:nums){
            psum=Math.max(psum+i,i);
            submax=Math.max(psum,submax);
        }
        return submax;
        }
    }
