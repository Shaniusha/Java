package Find_Fhe_Smallest_Integer_In_The_Array_15_5;

public class Find_The_Smallest {
    public static int findSmallestInt(int[] args) {
        int min = args[0];//   допустим что int min лежит в нулевой ячейке ,т.е 1-ый эл-т
        //который не обязательно является минимальным значением
        for (int i = 0; i < args.length; i++)
        {
            if(args[i] < min)// если текущее значение < min
                // проверяем первый элемент на каждой итерации, в основном нужно проверить
                // минимальное значение
                min = args[i];//min теперь содержит минимальное значение
        }
        return min;
    }

    public static void main(String[] args) {
        int[] actual = new int[] {78,56,232,12,11,43};// 11
        System.out.println(findSmallestInt(actual));

        int[] actua = new int[] {78,56,-2,12,8,-33};// -33
        System.out.println(findSmallestInt(actua));

        int[] actu = new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE};//Integer.MIN_VALUE
        System.out.println(findSmallestInt(actu));

    }
}
