package others;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * abc cba
 */
public class ValidAnagram242 {

    public static void main(String[] args) {
        System.out.println(answer1("qazwsxedc", "cxzdsaewq"));
        System.out.println(answer1("qazwsxedc", "cxzdsaewa"));
        System.out.println(answer1("qazwsxedc", "cxzdsae"));
        System.out.println(answer1("qazwsxedc", "cxzasdwqe"));
        System.out.println(answer1("qazwsxedc", "dggrghrth"));
        System.out.println(answer1("", ""));

        System.out.println();
        System.out.println(answer2("qazwsxedc", "cxzdsaewq"));
        System.out.println(answer2("qazwsxedc", "cxzdsaewa"));
        System.out.println(answer2("qazwsxedc", "cxzdsae"));
        System.out.println(answer2("qazwsxedc", "cxzasdwqe"));
        System.out.println(answer2("qazwsxedc", "dggrghrth"));
        System.out.println(answer2("", ""));
    }

    /**
     * 数组
     *
     * @param str1
     * @param str2
     * @return
     */
    private static boolean answer1(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        char a = 'a';
        for (int i = 0; i < chars1.length; i++) {
            num1[chars1[i] - a]++;
            num2[chars2[i] - a]++;
        }
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i])
                return false;
        }
        return true;
    }

    /**
     * 快排
     *
     * @param str1
     * @param str2
     * @return
     */
    private static boolean answer2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i])
                return false;
        }
        return true;
    }
}
