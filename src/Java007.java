import java.util.ArrayList;
import java.util.List;

public class Java007 {
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int intMax = Integer.MAX_VALUE;
        List<Integer> temp = new ArrayList<>();
        int tempX = x < 0 ? -x : x;
        while (tempX % 10 != 0 || tempX / 10 != 0) {
            temp.add(tempX % 10);
            tempX = tempX / 10;
        }
        int result = 0;
        for (int i = temp.size() - 1, j = 0; i >= 0; i--, j++) {
            int onlyValue = temp.get(i);
            for (int k = 0; k < j; k++) {
                if (intMax / 10 < onlyValue) {
                    return 0;
                }
                onlyValue = onlyValue * 10;
            }
            if ((intMax - onlyValue) < result) {
                return 0;
            }
            result = result + onlyValue;
        }
        return x < 0 ? -result : result;
    }

    //参考评论修正版
    public static int reverse2(int x) {
        int answer = 0;
        while (x != 0) {
            int pop = x % 10;
            if (answer * 10 / 10 != answer) {
                return 0;
            }
            answer = answer * 10 + pop;
            x /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = reverse2(12583495);
        System.out.println(result);
    }
}
