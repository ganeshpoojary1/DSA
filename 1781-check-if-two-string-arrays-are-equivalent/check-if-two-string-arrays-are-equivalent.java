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
      String str1=sb.toString();
      String str2=sb2.toString();
      if(str1.equals(str2)){
        return true;
      }
      else{
        return false;
      }
        
    }
}