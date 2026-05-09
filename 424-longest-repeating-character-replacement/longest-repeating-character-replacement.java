class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxfreq=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            maxfreq=Math.max(maxfreq,map.get(ch));

            if((right-left + 1)-maxfreq > k){
                char l = s.charAt(left);
                map.put(l,map.get(l)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}