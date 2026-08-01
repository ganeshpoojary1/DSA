class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int x:nums) total+=x;
        int player1=solve(nums,0,n-1);
        int player2=total-player1;
        return player1 >= player2;
    }
    private int solve(int[] nums,int i,int j){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int left=nums[i]+Math.min(solve(nums,i+2,j),solve(nums,i+1,j-1));
        int right=nums[j]+Math.min(solve(nums,i+1,j-1),solve(nums,i,j-2));
        return Math.max(left,right);
    }
}