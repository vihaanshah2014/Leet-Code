class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        // Fill the remaining positions with zeroes
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }
}
