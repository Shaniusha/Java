package What_Is_Between_22_5;

public class What_Is_Between {
    public static int[] between(int a, int b) { // 1-ый способ
        // your code here
        int j = 0;//номер эл-та(номер ячейки)
        int[] res = new int [b - a + 1]; //(b - a + 1) -столько эл-ов внутри массива  4-2+1=3 // 2-(-2)+1=5
        for (int i = a; i <= b; i++ ){// перебирает значения от a до b /от 2 до 4/(не ячейки в цикле)
           res [j]  = i ;//в каждую ячейку записываем значение от a до b /от 2 до 4/
            j = j + 1; // с каждым витком цикла номер ячейки увеличивается
           // System.out.print(j);
            //System.out.println(i);
        }
        return res;
    }
    public static int[] between1(int a, int b) { // 2-ой способ
    int[] result = new int[b - a + 1]; //(b - a + 1) -столько эл-ов внутри массива  4-2+1=3 // 2-(-2)+1=5
        for (int i = a; i <= b; i++) {
        result[i - a] = i; // result 2-2=2(в[0]лежит=2);3-2=1([1]=3);4-2=2([2]=4)
    }
        return result;
}
    public static void print (int[] array) {// метод печати результата
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int[] n = between(a,b);
        print(n);

        int c = -2;
        int d = 2;
        int[] m =  between(c,d);
        print(m);
    }
}

