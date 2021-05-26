package Invert_Values_25_5;

public class Invert_Values {
    public static int[] invert(int[] array) {

        for (int i = 0; i < array.length; i++){
           array[i] = array[i] * (-1); //array[i]-прохожу по всем эл-ам массива
        }                              // array[i] * (-1) -каждый эл-т * (-1)
        return array;
    }
    public static int[] invert1(int[] array) { // 2-ой способ
        int [] res = new int[array.length];
        for(int i = 0; i < array.length; i++)
            res[i] = -array[i];
        return res;
    }

    public static void print (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] n = invert(input);
          print(n);

        int[] input1 = new int[] {-1,2,-3,4,-5};
        int[] n1 = invert(input1);
          print(n1);

        int[] input2 = new int[] {};
        int[] n2 = invert(input2);
          print(n2);

        int[] input3 = new int[] {0};
        int[] n3 = invert(input3);
          print(n3);
       }
    }




