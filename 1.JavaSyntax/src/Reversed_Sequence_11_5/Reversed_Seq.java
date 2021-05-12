package Reversed_Sequence_11_5;

public class Reversed_Seq {
    public static int[] reverse(int n) {
        //your code
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = n - i;
        }
        return rev;
    }
    public static int[] reverse1(int n) {
        //your code
        int[] rev = new int[n];
        int j = 0;
        for (int i = n - 1; i == 0; i--) {
            rev[j] = i;
            j++;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] rever = reverse(n);
        for (int i = 0; i < n; i++) {
            System.out.println(rever[i]);
        }
    }
}



