class Solution {
    public boolean isValid(String s) {
       LinkedList<Character> l=new LinkedList<>();
       char[] x=s.toCharArray();
       for(char i:x){
        if(i=='(' || i=='{' || i=='['){
            l.addLast(i);
        }
        else if(l.size()!=0 && i==')' && l.peekLast()=='('){
            l.removeLast();
        }
        else if(l.size()!=0 && i=='}' && l.peekLast()=='{'){
            l.removeLast();
        }
        else if(l.size()!=0 && i==']' && l.peekLast()=='['){
            l.removeLast();
        }
        else{
            return false;
        }
       }
       if(l.size()!=0){
        return false;
       }
       return true;
    }
}