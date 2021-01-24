public class Java070 {
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        //n-1能走的所有路线 - 初始化（对应n==2）
        int n1 = 2;
        //n-2能走的所有路线 - 初始化（对应n==1）
        int n2 = 1;
        int result = 0;
        //从n=3开始计算
        for (int i = 3; i <= n; i++) {
            result = n1 + n2;
            int temp;
            temp = n1;
            n1 = result;
            n2 = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = climbStairs(5);
        System.out.println(result);
    }
}
