class Solution {
    public boolean isHappy(int n) {
        
       HashSet<Long> set = new HashSet<>();
       long sum=0;
       while(n!=1){
           sum=0;
       while(n!=0){
        int t=n%10;
            n=n/10;
            sum=sum+(t*t);
       }
       if(set.contains(sum)){
        return false;
       }
       else{
        set.add(sum);
       }
       n = (int) sum;
       }
       return true;
        }
       
    }
