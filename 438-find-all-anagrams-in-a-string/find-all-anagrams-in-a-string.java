class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        int left=0;
        for(char i:p.toCharArray()){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }
            else{
                map1.put(i,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int right=0;right<s.length();right++){
            char r = s.charAt(right);
            if(map2.containsKey(r)){
                map2.put(r,map2.get(r)+1);
            }
            else{
                map2.put(r,1);
            }

            if(right-left+1 > p.length()){
                char l = s.charAt(left);
                map2.put(l,map2.get(l)-1);
                left++;
                
                if(map2.get(l)==0){
                    map2.remove(l);
                }
            }
            if(map1.equals(map2)){
                list.add(left);
            }
        }
        return list;
    }
}