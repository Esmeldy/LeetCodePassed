package LeetCode;

public class MoveZeroes {

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for (int i : nums ) {
            System.out.print(i+",");
        }

    }

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

     Note that you must do this in-place without making a copy of the array.
     Example 1:

     Input: nums = [0,1,0,3,12]
     Output: [1,3,12,0,0]
     */
    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0) { //si es un numero
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }


        }
        return nums;
    }
}
