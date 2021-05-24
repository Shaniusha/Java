package Convert_Number_To_Reversed_Array_Of_Digits_13_5;

public class Convert_Number {
    public static int[] digitize(long n) {
        // Code here
        int num = (int) n;
        String numStr = Integer.toString(num);//метод преобразование int в String
        StringBuilder reverser = new StringBuilder(numStr);
        reverser.reverse();
        String[] str = reverser.toString().split("");
        int[] st = new int[str.length];
        int i = 0;
        for (String s : str) {
            st[i] = Integer.valueOf(s);
            i++;
        }
        return st;
    }

    public static void main(String[] args) {
        long number = 35231;
        int num = (int) number;

        int[] rever = digitize(num);
        for (int i = 0; i < rever.length; i++)
           System.out.println(rever[i]); //?
       //System.out.println(reverseNumber(num));

        }
    }



//    public void tests() {
  //      assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
//