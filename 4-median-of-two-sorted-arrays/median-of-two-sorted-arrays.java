class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] total=new int[m+n];
        for(int i=0;i<m;i++){
            total[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            total[m+j]=nums2[j];
        }
        Arrays.sort(total);
        int a=0;
        int b=total.length-1;
        while(a<b){
            a++;
            b--;
        }
        if(total[a]==total[b]){
           return total[a]*1.0;
        }
        else{
           return (total[a]+total[b])*1.0/2;
        }
    }
}