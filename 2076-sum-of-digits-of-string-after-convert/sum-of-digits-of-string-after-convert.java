class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            int val=c-'a'+1;
            sb.append(val);
        }
        String num = sb.toString();
        while (k-- > 0 && num.length() > 1) {
            int sum = 0;
            for (char ch : num.toCharArray()) {
                sum += ch - '0';
            }
            num = String.valueOf(sum);
        }

        return Integer.parseInt(num);
    }
}