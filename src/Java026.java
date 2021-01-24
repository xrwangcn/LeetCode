public class Java026 {
    public static int removeDuplicates(int[] nums) {
        int size = 1;
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[size] = nums[i + 1];
                size++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] test1 = {0};
        int result = removeDuplicates(test1);
        System.out.println(result);
    }
}
