class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder sb=new StringBuilder();
      for(String c:word1){
        sb.append(c);
      }
      StringBuilder sb2=new StringBuilder();
      for(String k:word2){
        sb2.append(k);
      }
      return sb.toString().equals(sb2.toString());
        
    }
}