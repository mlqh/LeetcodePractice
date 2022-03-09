public class SubstringReplacement {
    public static String replaceSubstring(String s, String a, String b) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a.charAt(0)) {
                if (s.substring(i, i + a.length()).equals(a)) {
                    newStr.append(b);
                    i += a.length() - 1;
                }
            } else {
                newStr.append(s.charAt(i));
            }
        }
        return newStr.toString();
    }
}
