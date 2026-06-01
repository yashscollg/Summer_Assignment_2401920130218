class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        int initial;
        int s=0;
        for(int j=0;j<nums.length;j++){
            initial=nums[j];
            for(int i=j+1;i<nums.length;i++)
            {
                s=initial+nums[i];
                if(s==target)
                {
                    a[0]=j;
                    a[1]=i;
                    break;

                }
            }
        }
        return a;
    }
}