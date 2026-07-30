class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int[] arr = new int[26];
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int count=0;
        int min=0;
        for(int i=25;i>=0;i--){ 
            int val=arr[i]*(count/8+1);
            min+=val;
            count++;
        }
        return min; 
    }
}