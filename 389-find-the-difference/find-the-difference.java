class Solution {
    public char findTheDifference(String s, String t) {
        int sumS=0;
        for(char c:s.toCharArray()){
          sumS+=c;
        }
        int sumT=0;
        for(char c:t.toCharArray()){
            sumT+=c;
        }
        return (char)(sumT-sumS);
    }
}