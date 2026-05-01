class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];

             if(h.containsKey(sum)){
                return new int[]{h.get(sum),i};
             }
             h.put(nums[i],i);   
            }
             return new int[]{};

            
        }
       
    }
