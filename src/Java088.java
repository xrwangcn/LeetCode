import utils.PrintUtil;

public class Java088 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        for (int i = 0, j = 0, k = 0; i < m + n; i++) {
            if (j < m && k < n) {
                if (nums1[j] < nums2[k]) {
                    result[i] = nums1[j];
                    j++;
                } else {
                    result[i] = nums2[k];
                    k++;
                }
            } else if (j == m && k < n) {
                result[i] = nums2[k];
                k++;
            } else if (j < m && k == n) {
                result[i] = nums1[j];
                j++;
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 0,0,0};
        int[] test2 = {2, 5, 6};
        merge(test1, 5, test2, 3);
        PrintUtil.printArr(test1);
    }
}
