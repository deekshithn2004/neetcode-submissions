class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int i,j=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]==nums[j]){return true;}
            j++;
        }
        return false;
    }
}