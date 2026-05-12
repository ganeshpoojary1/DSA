class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o');
        vowels.add('u');
        int count=0;
        int max=0;
        for(int j=0;j<k;j++){
            if(vowels.contains(s.charAt(j))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i)))
                count++;
            if(vowels.contains(s.charAt(i-k)))
                count--;

        max=Math.max(max,count);        
        }  
        return max;      
    }
}