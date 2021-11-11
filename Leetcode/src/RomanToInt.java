import java.util.HashMap;

/**
 * Use case to convert roman to int Start from end of string, if prev is smaller
 * than next, subtract, otherwise, add
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int sum = intFromRoman(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            char currCh = s.charAt(i);
            char prevCh = s.charAt(i + 1);
            if (intFromRoman(currCh) < intFromRoman(prevCh)) {
                sum -= intFromRoman(currCh);
            } else {
                sum += intFromRoman(currCh);
            }
        }
        return sum;
    }

    private static int intFromRoman(char romanNumber) {
        switch (romanNumber) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        }
        return 0;
    }

    // map is slower, uses more memory
    // HashMap<Character, Integer> map = new HashMap<>();
    // map.put('I', 1);
    // map.put('V', 5);
    // map.put('X', 10);
    // map.put('L', 50);
    // map.put('C', 100);
    // map.put('D', 500);
    // map.put('M', 1000);

    // int sum = map.get(s.charAt(s.length() - 1));

    // for (int i = s.length() - 2; i >= 0; i--) {
    // char curr = s.charAt(i);
    // char next = s.charAt(i + 1);
    // if (map.get(curr) < map.get(next)) {
    // sum -= map.get(curr);
    // } else {
    // sum += map.get(curr);
    // }
    // }
    // return sum;
    // }

}
