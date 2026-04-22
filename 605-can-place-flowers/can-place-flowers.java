class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        if(n==0){
            return true;
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                if((i==0 || a[i-1]==0) && (i==a.length-1 || a[i+1]==0)){
                    count++;
                    a[i]=1;

                    if(count==n){
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
        
    }
}