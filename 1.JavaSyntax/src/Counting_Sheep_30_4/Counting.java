package Counting_Sheep_30_4;

public class Counting {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (present != null && present) {
                counter += 1;
            }
        }
        return counter;
    }



        public static void main (String[]args){
            Boolean[] array1 = {true,  true,  true,  false,
                    true,  true,  true,  true ,
                    true,  false, true,  false,
                    true,  false, false, true ,
                    true,  true,  true,  true ,
                    false, false, true,  true,
                    true,  true,  true,  true };
            System.out.println(countSheeps(array1));

        }
    }

