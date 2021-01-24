import utils.PrintUtil;

public class Java066 {
    public static int[] plusOne(int[] digits) {
        int digitsLength = digits.length;
        //没有进位直接结束
        if (digits[digitsLength - 1] + 1 < 10) {
            digits[digitsLength - 1] = digits[digitsLength - 1] + 1;
            return digits;
        }
        //设置一个多一位的数组
        int[] resultTemp = new int[digits.length + 1];
        //初始化
        resultTemp[0] = 0;
        for (int i = 0; i < digits.length; i++) {
            resultTemp[i + 1] = digits[i];
        }
        resultTemp[digitsLength] = 0;
        int extra = 1;
        for (int i = digitsLength - 1; i >= 0; i--) {
            resultTemp[i] = resultTemp[i] + extra;
            if (resultTemp[i] == 10) {
                resultTemp[i] = 0;
                extra = 1;
            } else {
                break;
            }
        }
        //首位为1直接返回结果，说明第一位进位成功
        if (resultTemp[0] == 1) {
            return resultTemp;
        }

        for (int j = digitsLength - 1; j >= 0; j--) {
            digits[j] = resultTemp[j + 1];
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] test1 = {1,2,9};
        int[] result = plusOne(test1);
        PrintUtil.printArr(result);
    }
}
