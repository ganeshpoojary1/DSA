class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int curnum=0;
        String curString = "";
        for(char c:s.toCharArray()){
            if(c=='['){
                stringStack.push(curString);
                numStack.push(curnum);
                curString="";
                curnum=0;
            }
            else if(c==']'){
                int num=numStack.pop();
                String prevString=stringStack.pop();
                StringBuilder temp = new StringBuilder(prevString);
                for(int i=0;i<num;i++){
                    temp.append(curString);
                }
                curString=temp.toString();
            }
            else if(Character.isDigit(c)){
                curnum = curnum*10 + c - '0';
            }
            else{
                curString+=c;
            }
        }
        return curString;
        
    }
}