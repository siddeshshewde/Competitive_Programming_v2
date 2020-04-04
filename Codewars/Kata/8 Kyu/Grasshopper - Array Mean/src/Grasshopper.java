public class GrassHopper {
    
    public static int findAverage(int[] nums) {
        for (int i=1;i<nums.length;i++)
        {
            nums[0] = nums[0] + nums[i];
        }
        return nums[0]/nums.length;
    }
}