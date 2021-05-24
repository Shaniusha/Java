package Lario_And_Muigi_Pipe_Problem_14_5;

public class Lario {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int[] num = new int[]{numbers.length};//?новый измененный массив
       for( int i = 0; i < num.length; i++){

         num[i] = i + 1;// взять 1-ое значение и + 1 пока не дойдем до последнего
       }
       return num;
    }
    public static void print (int[] array) {// метод печати результата
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] n = new int[] {1,2,3,5,6,8,9}; //{1,2,3,4,5,6,7,8,9}
        int[] n1 = pipeFix(n);
       // System.out.println(print(n1));// это одно и то же?

        int[] m = new int[] {1,2,3,12}; //{1,2,3,4,5,6,7,8,9,10,11,12}
        int[] m1 = pipeFix(m);
        System.out.println(m1);

        int[] l = new int[] {6,9}; //{6,7,8,9}
        int[] l1 = pipeFix(l);
        System.out.println(l1);

        int[] p = new int[] {-1,4}; //{-1,0,1,2,3,4}
        int[] p1 = pipeFix(p);
        System.out.println(p1);

        int[] s = new int[] {1,2,3}; //{1,2,3}
        int[] s1 = pipeFix(s);
        System.out.println(s1);
    }
}


