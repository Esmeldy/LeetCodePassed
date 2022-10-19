package LeetCode;

/*
 * 167. Two Sum II - Input Array Is Sorted
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * Your solution must use only constant extra space.
 */

//Spanish

import java.util.HashMap;

/**
 * Dada una matriz de números enteros indexada en 1 que ya está ordenada en orden no decreciente,
 * busque dos números que sumen un número objetivo específico.
 * Sean estos dos números: números[índice1] y números[índice2] donde 1 <= índice1 < índice2 <= números.longitud.
 * Devuelve los índices de los dos números, índice1 e índice2,
 * sumados por uno como una matriz de enteros [índice1, índice2] de longitud 2.
 * Las pruebas se generan de manera que haya exactamente una solución.
 * No puede usar el mismo elemento dos veces. Su solución debe usar solo espacio adicional constante.
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        int result [] = twoSum(nums, target);

        for (int i: result ) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        var x = new HashMap<Integer,Integer>();

        for (int i =0; i< numbers.length;i++){
            x.put(numbers[i], i);
        }

        for (int i = 0; i<numbers.length;i++){
            //resta el valor de target al valor del elemento i en el Array
            var difference = target - numbers[i];

            //Encuentra el indice del numero restante anterior
            var indexDifference = x.get(difference);

            //Si en el map contiene el resto, sería 0.
            if (x.containsKey(difference) && (i != indexDifference)){
                return new int [] {i+1, indexDifference+1};
            }

        }
        return new int [] {};
    }
}
