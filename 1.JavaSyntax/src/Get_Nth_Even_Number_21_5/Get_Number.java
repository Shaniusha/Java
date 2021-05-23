package Get_Nth_Even_Number_21_5;

public class Get_Number {
    public static int nthEven(int n) {

        return (n - 1) * 2;
      // или  другое решение: return 2*n - 2;// одно и то же
    }
    public static void main(String[] args){

        int a = 1; // 0 , (первое четное число - 0)
        int b = 2; // 2
        int c = 3; // 4 , (третье четное число - 4 (0, 2, 4))
        int d = 100; // 198
        int f = 1298734; // 2597466
        System.out.println(nthEven(a));
        System.out.println(nthEven(b));
        System.out.println(nthEven(c));
        System.out.println(nthEven(d));
        System.out.println(nthEven(f));
    }
}



