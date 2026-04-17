class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb =  new StringBuilder();
        int i=0;
        int j=0;

        int pick=0;

        while((i<word1.length()) && (j<word2.length())){
            if(pick==0){
                sb.append(word1.charAt(i));
                i++;
                pick=1;
            }
            else{
                sb.append(word2.charAt(j));
                j++;
                pick=0;
            }
        }
        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
        
    }
}