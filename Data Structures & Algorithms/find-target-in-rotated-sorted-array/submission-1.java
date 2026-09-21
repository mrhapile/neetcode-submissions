class Solution {
    public int search(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length -1 ;
        while(low < high ){
            int guess = (low + high)/2;
            if(nums[guess] > nums[high]){
                low = guess+1;
            }else{
                high = guess;
            }
        }
        int ans1 = binary(nums,target,0,low-1);
        int ans2 = binary(nums,target,low,nums.length-1);
        if(ans1 == -1 && ans2 == -1){
            return -1;
        }else{
            if(ans1 == -1){
                return ans2;
            }else{
                return ans1;
            }
        }
    }
    private int binary(int[] nums,int target,int low , int high){
        while(low<=high){
            int guess = (low+high)/2;
            if(nums[guess] == target){
                return guess;
            }else if(nums[guess]>target){
                high = guess -1;
            }else{
                low = guess+1;
            }
        }
        return -1;
    }
}
