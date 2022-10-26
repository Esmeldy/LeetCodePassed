package LeetCode;

import java.util.HashMap;



/**
 * 13. Roman to Integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String num = "IIIX";
        System.out.println(romanToInt(num));
    }

    public static <Char> int romanToInt(String s) {
        char letter = 0;
        int result = 0;
        HashMap<Character, Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);

        if (s.length() < 2 ) result = romans.get(s);

        for (int i=0; i<s.length();i++) {
                letter = s.charAt(i);

            result += romans.get(letter);
            //Si el número actual es menor al siguiente se resta

        }



        return result;
    }
}
