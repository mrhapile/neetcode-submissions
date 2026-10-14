class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(map.containsKey(nums[i])){
                if(check(i , map.get(nums[i]),k)){
                   return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public boolean check(int i , int j , int k){
        if(Math.abs(i-j)<=k){
            return true;
        }
        return false;
    }
}