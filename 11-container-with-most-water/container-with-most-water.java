class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int sum=0;
        int max=0;
        int width=0;
        while(left!=right){
            int mini = Math.min(height[left],height[right]);
            width=right-left;
            sum = mini*width;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            } 
            max=Math.max(max,sum);
        }
        return max;
    }
}