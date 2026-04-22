class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr=s.toCharArray();
        char[] arr1=t.toCharArray();

        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean found=false;

            for(int j=k;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    found=true;
                    k=j+1;
                    break;
                }
            }
            if(!found){
                return false;
            }

        }
        return true;
    }
}