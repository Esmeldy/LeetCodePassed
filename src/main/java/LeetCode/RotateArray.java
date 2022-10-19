package LeetCode;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {

    public static void main(String[] args) {
        int steps = 3;
        int [] nums = {1,2,3,4,5,6,7};

        rotate(nums, steps);
        for (int i: nums ) {
            System.out.print(i+" ");
        }
    }

    public static int[] rotate(int[] nums, int k) {
        k %= nums.length;

        int [] newNums = new int[nums.length];
        //Copiamos el array en otro
        System.arraycopy(nums, 0, newNums, 0, nums.length);

        //ahora ordenamos el array nums con los datos del nuevo

        for (int i = 0; i < k; i++) {
            nums[i] = newNums[newNums.length - k + i];

        }
        //ahora se añaden los datos restantes al array
        for (int i = 0; i < newNums.length - k; i++) {
            nums[k+i] = newNums[i];

        }

        return nums;

    }
}
