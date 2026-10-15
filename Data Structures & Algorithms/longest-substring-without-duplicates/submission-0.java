class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int count = 0;
        int i = 0;
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);
            while(st.contains(ch)){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(ch);
            count = Math.max(count , j - i +1);
        }
        return count;
    }
}
