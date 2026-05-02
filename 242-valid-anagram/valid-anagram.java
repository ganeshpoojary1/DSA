class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
         for(char i :s.toCharArray()){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }
            else{
                map1.put(i,1);
            }
         }
         for(char j:t.toCharArray()){
            if(map2.containsKey(j)){
                map2.put(j,map2.get(j)+1);
            }
            else{
                map2.put(j,1);
            }
         }
         if(map1.equals(map2)){
            return true;
         }
         else{
            return false;
         }
        
    }
}