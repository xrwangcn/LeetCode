public class Java014 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length == 0) {
            return result.toString();
        }
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            boolean preResult = true;
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != first.charAt(i)) {
                    preResult = false;
                    break;
                }
            }
            if (!preResult) {
                break;
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] test1 = new String[2];
        test1[0] = "ab";
        test1[1] = "a";
        String result = longestCommonPrefix(test1);
        System.out.println(result);
    }
}
