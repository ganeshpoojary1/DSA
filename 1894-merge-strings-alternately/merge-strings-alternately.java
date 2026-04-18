class Solution {
    public String mergeAlternately(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        int pick=0;
        while((i<a.length())&& j<b.length()){
            if(pick==0){
            sb.append(a.charAt(i));
            i++;
            pick=1;
        }
        else{
            sb.append(b.charAt(j));
            j++;
            pick=0;
        }
    }
    while(i<a.length()){
        sb.append(a.charAt(i));
        i++;
    }
    while(j<b.length()){
        sb.append(b.charAt(j));
        j++;
    }
    return sb.toString();
    }
}