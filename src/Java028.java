public class Java028 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int start = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.length() - i < needle.length()) {
                return -1;
            }
            boolean result = true;
            for (int j = 0, k = i; j < needle.length(); j++, k++) {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return i;
            }
        }
        return start;
    }

    //"mississippi"
    //"a"
    public static void main(String[] args) {
        int result = strStr("mississippi", "a");
        System.out.println(result);
    }
}
