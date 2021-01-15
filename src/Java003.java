import java.util.HashMap;
import java.util.Map;

public class Java003 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        Map<Character, Integer> result = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (result.containsKey(s.charAt(i))) {
                left = Math.max(left, result.get(s.charAt(i)) + 1);
            }
            result.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
        System.out.println(result);
    }
}
