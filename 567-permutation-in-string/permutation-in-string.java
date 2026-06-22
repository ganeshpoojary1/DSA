class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char i:s1.toCharArray()){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }
            else{
                map1.put(i,1);
            }
        }
        int left=0;
        for(int right=0;right<n;right++){
            char r = s2.charAt(right);
            if(map2.containsKey(r)){
                map2.put(r,map2.get(r)+1);
            }
            else{
                map2.put(r,1);
            }
            if(right-left+1>m){
                char l = s2.charAt(left);
                map2.put(l,map2.get(l)-1);
                if(map2.get(l)==0){
                    map2.remove(l);
                }
                left++;
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}