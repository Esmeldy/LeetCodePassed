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
        String num = "MCMXCIV";
        System.out.println(romanToInt(num));
    }

    public static int romanToInt(String s) {

        int result = 0;
        HashMap<Character, Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);

     //   if (s.length() < 2 ) result = romans.get(s.charAt(0));

        for (int i=0; i<s.length();i++) {

            int numCurrent = romans.get(s.charAt(i));
          //  int nextNum = romans.get(s.charAt(i+1));

            //Si el número actual es menor al siguiente se resta
            //al resultado
            //el i+1 para asegurarnos de no salir del Array
            if (i + 1 < s.length() && numCurrent < romans.get(s.charAt(i+1))){
                result -= numCurrent;
            }
            else {
                result += numCurrent;
            }
        }
        return result;
    }
}
