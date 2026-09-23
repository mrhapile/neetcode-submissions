class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder storedString = new StringBuilder();
        int k = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + ch - '0';
            }else if(ch == '['){
                countStack.push(k);
                stringStack.push(storedString);
                k = 0;
                storedString = new StringBuilder();
            }else if(ch == ']'){
                int repeat = countStack.pop();
                StringBuilder decode = stringStack.pop();

                for(int i = 0 ; i < repeat ; i++){
                    decode.append(storedString);
                }
                storedString = decode;
            }else{
                storedString.append(ch);
            }
        }
        return storedString.toString();
    
    }
}