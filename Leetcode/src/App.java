public class App {
    public static void main(String[] args) {
        // System.out.println(ValidParentheses.isValid("({[])"));
        // System.out.println(PalindromeInt.isPalindrome(1234554321));
        // System.out.println(MinimumValueStepByStep.minStartValuePrefix(new int[] { -3,
        // 2, -3, 4, 2 }));
        // System.out.println(RomanToInt.romanToInt("IV"));
        int[][] nRooksInput = { { 1, 2 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }, { 7, 7 }, { 8, 8 } };
        System.out.println(N_Rooks.checkAttack(nRooksInput));
    }

}
