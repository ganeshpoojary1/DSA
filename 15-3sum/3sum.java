class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int k=0;k<nums.length-2;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                List<Integer> temp = new ArrayList<>();
                int sum=nums[k]+nums[i]+nums[j];
                if(sum==0){
                    temp.add(nums[k]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    list.add(temp);
                    i++;
                    j--;
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }
                    while(i<j && nums[j]==nums[j+1]){
                        j--;
                    }
                }
                else if(sum>0){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return list;
        
    }
}