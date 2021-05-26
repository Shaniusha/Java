package Lario_And_Muigi_Pipe_Problem_14_5;

public class Lario {
    public static int[] pipeFixs(int[] numbers) {
        // Fix the pipes!
        int start = numbers[0];// эл-т который лежит в [0] ячейке,т е первый
        int size = numbers.length - 1;// номер последней ячейки - 1
        int lastSize = numbers[size];// в arraySize лежит последний эл-т массива
        int arraySize;

          arraySize = lastSize - start + 1;// длина нового массива

        int[] num = new int[arraySize];
        int j = 0;//начальное значение счетчика ячейки в новом массиве

       for( int i = start; j < num.length ; i++){

         num[j] = i ;// в очередную ячейку записываем новое значение i которое дает цикл
         j++;
       }
       return num;
    }
    public static void print (int[] array) {// метод печати результата
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");// так все массивы (примеры) пишутся в одну строку без " "
        }
        System.out.println();// если у меня несколько примеров(каждый массив с новой строки)
    }

    public static void main(String[] args) {
        int[] n = new int[] {1,2,3,5,6,8,9}; //{1,2,3,4,5,6,7,8,9}
        int[] n1 = pipeFixs(n);
        print(n1);

        int[] m = new int[] {1,2,3,12}; //{1,2,3,4,5,6,7,8,9,10,11,12}
        int[] m1 = pipeFixs(m);
        print(m1);


        int[] l = new int[] {6,9}; //{6,7,8,9}
        int[] l1 = pipeFixs(l);
        print(l1);


        int[] p = new int[] {-1,4}; //{-1,0,1,2,3,4}
        int[] p1 = pipeFixs(p);
        print(p1);


        int[] s = new int[] {1,2,3}; //{1,2,3}
        int[] s1 = pipeFixs(s);
        print(s1);

    }
}


