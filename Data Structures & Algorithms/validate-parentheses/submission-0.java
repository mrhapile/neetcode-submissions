class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                check.push(ch);
            }else{
                if(check.isEmpty()){
                    return false;
                }
                char hc = check.peek();
                if(hc == '(' && ch == ')'){
                    check.pop();
                }else if(hc == '{' && ch == '}'){
                    check.pop();
                }else if(hc == '[' && ch == ']'){
                    check.pop();
                }else{
                    return false;
                }
            }   
        }
        return check.isEmpty();
    }
}