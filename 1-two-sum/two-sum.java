    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                int sum=target-nums[i];
                if(map.containsKey(sum)){
                    list.add(map.get(sum));
                    list.add(i);
                    break;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            return new int[]{list.get(0),list.get(1)};
        }
    }