class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        String vowels="AEIOUaeiou";

        int start=0;
        int end=ch.length-1;

        while(start<end){
            while(start < end && vowels.indexOf(ch[start])==-1 ){
                start++;
            }
            while(start<end && vowels.indexOf(ch[end])==-1){
                end--;
            }
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}