public class Java013 {
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int actNum = 0;
            switch (s.charAt(i)) {
                case 'I':
                    actNum = i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') ? -1 : 1;
                    break;
                case 'V':
                    actNum = 5;
                    break;
                case 'X':
                    actNum = i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') ? -10 : 10;
                    break;
                case 'L':
                    actNum = 50;
                    break;
                case 'C':
                    actNum = i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') ? -100 : 100;
                    break;
                case 'D':
                    actNum = 500;
                    break;
                case 'M':
                    actNum = 1000;
                    break;
            }
            sum += actNum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }
}
