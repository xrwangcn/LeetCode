public class Java053 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        //DP缓存
        int[] dp = new int[nums.length];
        //初始化
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //状态转移方程 f(i)=max(f(i-1)+a[i],a[i]))
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }

        int max = dp[0];
        for (int dpMax : dp) {
            max = Math.max(max, dpMax);
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int preMax = 0;
        int actMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            //状态转移方程 f(i)=max(f(i-1)+a[i],a[i]))
            //如果f(i-1)+a[i]没有a[i]大，那么之前的结果都抛弃
            preMax = Math.max(preMax + nums[i], nums[i]);
            //实际最大值与当前最大值比较，不断更新最大值
            actMax = Math.max(preMax, actMax);
        }
        return actMax;
    }

    public static void main(String[] args) {
        int[] test1 = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray2(test1);
        System.out.println(result);
    }
}
