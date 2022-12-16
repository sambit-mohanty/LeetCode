package Easy;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] returnArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            returnArray[i] = sum;
        }

        return returnArray;
    }
}
