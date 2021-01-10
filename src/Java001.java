public class Java001 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[4];
        test1[0] = 3;
        test1[1] = 3;
        test1[2] = 4;
        test1[3] = 15;
        int[] result = twoSum(test1, 6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
