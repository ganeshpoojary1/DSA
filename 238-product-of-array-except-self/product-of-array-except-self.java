class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int leftProduct[] = new int[nums.length];
        int rightProduct[]=new int[nums.length];


        int temp=1;
        for(int i=0; i < nums.length;i++){
            leftProduct[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            rightProduct[i]=temp;
            temp=temp*nums[i];
        }

        int [] res =new int[nums.length];
        for(int i=0;i<res.length;i++){
            res[i]=leftProduct[i]*rightProduct[i];
        }
        return res;
    }
}