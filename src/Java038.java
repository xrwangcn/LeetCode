public class Java038 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder newStr = new StringBuilder();
        String nStr = countAndSay(n - 1);
        int calNum = 1;
        for (int i = 0; i < nStr.length(); i++) {
            if (i + 1 == nStr.length() || nStr.charAt(i) != nStr.charAt(i + 1)) {
                newStr.append(calNum);
                newStr.append(nStr.charAt(i));
                calNum = 1;
                continue;
            }
            calNum++;
        }
        return newStr.toString();
    }

    public static String countAndSay2(int n) {
        String[] cache = new String[30];
        return countAndSayCache(n, cache);
    }

    private static String countAndSayCache(int n, String[] cache) {
        if (n == 1) {
            return "1";
        }
        StringBuilder newStr = new StringBuilder();
        String nStr;
        if (cache[n-1] != null) {
            nStr = cache[n-1];
        } else {
            nStr = countAndSay(n - 1);
        }

        int calNum = 1;
        for (int i = 0; i < nStr.length(); i++) {
            if (i + 1 == nStr.length() || nStr.charAt(i) != nStr.charAt(i + 1)) {
                newStr.append(calNum);
                newStr.append(nStr.charAt(i));
                calNum = 1;
                continue;
            }
            calNum++;
        }
        cache[n] = newStr.toString();
        return newStr.toString();
    }

    public static void main(String[] args) {
        String result = countAndSay2(7);
        System.out.println(result);
    }
}
