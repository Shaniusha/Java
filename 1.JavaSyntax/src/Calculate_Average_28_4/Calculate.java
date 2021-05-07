package Calculate_Average_28_4;

public class Calculate {
    public static double find_average(int[] array)
    {
        if (array.length == 0)
            return 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
         sum = array [i] + sum;
        }
        double d = sum/array.length;
        return d;
    }
    public static void main(String[]args){
         int[] arr = new int[]{1,2,3};
         double s = find_average(arr);
         System.out.println(s);
         System.out.println("I love my mom :)");
    }
}
