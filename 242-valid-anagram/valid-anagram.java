class Solution {
    public boolean isAnagram(String s, String t) {
     int[] count=new int[26];
     for(int i:s.toCharArray()){
        count[i-'a']++;
     }  
     for(char j:t.toCharArray()){
        count[j-'a']--;
     } 
     for(int val:count){
        if(val!=0){
            return false;
        }
        
     }
     return true;
    }
}
