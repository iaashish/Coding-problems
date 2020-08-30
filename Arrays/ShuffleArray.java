class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
       for(int i =0, j=0; i < n; i++, j=j+2){
            result[j] = nums[i];
            result[j+1] = nums[n+i];
        }
        return result;
    }
}