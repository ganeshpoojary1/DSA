class Solution {
    public String reverseWords(String s) {
        
        String [] part=s.split(" ");
        for(int i=0;i<part.length;i++){
            char[] ch=part[i].toCharArray();
            int start=0;
            int end=ch.length-1;
            while(start<end){
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
            part[i]=new String(ch);
        }
        return String.join(" ",part);
    }
}