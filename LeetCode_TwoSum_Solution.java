// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
//        Below is my Solution for the given problem.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int [] result = new int[2];
        int num1 = 0;
        int sum=0;
        for(int i=0;i<len;i++){
            num1=nums[i];
        
        for(int j = i+1; j < len; j++)
            {
                sum = num1+nums[j];       
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        
        }
        return result;
    }
}
