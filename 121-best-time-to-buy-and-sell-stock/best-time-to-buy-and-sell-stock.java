class Solution {
    public int maxProfit(int[] p) {
        int[] min=new int [p.length];
        int max=0;
        min[0]=p[0];
        for(int i=1;i<=p.length-1;i++){
            min[i]=Math.min(p[i],min[i-1]);
        }
        for(int i=1;i<=p.length-1;i++){
            max=Math.max(max,(p[i]-min[i-1]));
        }
        return max;
       
       }
        }
    
