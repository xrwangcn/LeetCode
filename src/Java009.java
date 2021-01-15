public class Java009 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int answer = 0;
        int temp = x;
        while (x != 0) {
            int pop = x % 10;
            if (answer * 10 / 10 != answer) {
                return false;
            }
            answer = answer * 10 + pop;
            x /= 10;
        }
        return answer == temp;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(0);
        System.out.println(result);
    }
}
