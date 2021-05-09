package Powersf_Of_2_9_5;

import java.util.Arrays;

public class Powers {
    public static long[] powersOfTwo(int n){
        //TODO: Have fun : получайте удовольствие
      long[] powers = new long[n + 1];
        for(int i = 0; i <= n; i++ ) {
            powers[i] =(long)Math.pow(2, i);// Math.pow - математическая функция возведение в степень
        }                                   //(long) - приведение типа long к типу double,т.к степень это double
        return powers;                      // (2,i) - 2 в степени i
    }
    public static void main (String[] args){
//        int[] power0 = {1};//2^0   2 в степени 0 = 1
//        int[] power1 = {1,2};//2^0,2^1
//        int[] power2 = {1,2,4};//2^0,2^1,2^2
//        int[] power3 = {1,2,4,8,};//2^0,2^1,2^2,2^3
//        int[] power4 = {1,2,4,8,16};//2^0,2^1,2^2,2^3,2^4
        System.out.println(Arrays.toString(powersOfTwo(4)));//Метод Arrays.toString() возвращает строковое
        // представление одномерного массива, разделяя элементы запятой. Вместо того чтобы перебирать массивы циклом for,
        // можно воспользоваться этим методом для вывода элементов на консоль:
        // 2 ^ 4   2 в степени 4   n-это степень
    }
}
