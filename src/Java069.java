public class Java069 {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1;
        int right = x;
        int res = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (x / mid == mid) {
                res = mid;
                break;
            } else if (x / mid < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
                res = mid;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int result = mySqrt(4);
        System.out.println(result);
    }
}
