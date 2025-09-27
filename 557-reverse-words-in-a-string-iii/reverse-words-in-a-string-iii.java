class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for(String word:words){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            reverse.append(sb).append(" ");
        }
        return reverse.toString().trim();

        
      
    }
}