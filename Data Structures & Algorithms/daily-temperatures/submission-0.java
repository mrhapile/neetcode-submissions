class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[t.length];
        for(int i = 0 ; i< t.length ; i++){
            while(!st.isEmpty() && t[st.peek()] < t[i]){
                int pop = st.pop();
                res[pop] = i - pop;
            }
            st.push(i);
        }
        return res;
    }
}
