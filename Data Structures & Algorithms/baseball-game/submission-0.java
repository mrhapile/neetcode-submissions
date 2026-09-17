class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> record = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("C")){
                record.pop();
            }else if(operations[i].equals("D")){
                record.push(2*record.peek());
            }else if(operations[i].equals("+")){
                int a = record.pop();
                int b = record.peek();
                record.push(a);
                record.push(a+b);
            }else{
                record.push(Integer.parseInt(operations[i]));
            }
        }
        int ans = 0;
        while(!record.isEmpty()){
            ans += record.pop();
        }
        return ans;
    }
}