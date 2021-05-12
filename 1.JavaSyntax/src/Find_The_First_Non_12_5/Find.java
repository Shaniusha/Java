package Find_The_First_Non_12_5;

public class Find {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++){
          int r = array[i] - array[i- 1];
          if (r != 1)
              return array[i];
        }
        return null;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,7,9};
        int[] array1 = new int[]{1,2,3,4,5,6,7};
        Integer inter = find(array);
        Integer inter1 = find(array1);

        System.out.println(inter);
        System.out.println(inter1);
    }
}
