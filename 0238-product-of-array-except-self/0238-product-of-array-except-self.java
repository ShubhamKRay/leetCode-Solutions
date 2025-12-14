class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int product=1; int countZero=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0)
            product=product*nums[i];
            else
            countZero++;
        }
        if(countZero>1)
        return result;

        for(int i=0; i<nums.length; i++){
            if(countZero==0)
            result[i]=product/nums[i];
            else{
                // result[i] = nums[i]!=0? 0 : product;
                if(nums[i] == 0)
                result[i]=product;
            }
        }
        return result;
    }
}