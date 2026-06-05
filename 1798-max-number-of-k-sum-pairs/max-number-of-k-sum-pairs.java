class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int target = k-nums[i];
            if(map.containsKey(target)){
                count++;
                if(map.get(target) == 1){
                    map.remove(target);
                }
                else{
                    map.put(target,map.get(target)-1);
                }
            }
            else{
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
        return count;  
    }
}