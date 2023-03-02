import static java.lang.Math.*;

public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums) {
        //using math abs to change - to +
        /**for (int index = 0; index < nums.length; index++) {
            nums[index] = abs(nums[index]);
        }*/

        //without using abs
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] < 0)
                nums[index] = -nums[index];
        }
        return nums;
    }
}