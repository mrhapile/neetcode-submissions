class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb  = new StringBuilder();
       for(int i = 0 ; i< s.length() ; i++){
        char ch = s.charAt(i);
        if(Character.isLetter(ch) || Character.isDigit(ch)){
            sb.append(ch);
        }
       } 
       String result = sb.toString();
       result = result.toLowerCase();
       int i = 0;
       int j = result.length()-1;
       while(i<=j){
        if(result.charAt(i) != result.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}