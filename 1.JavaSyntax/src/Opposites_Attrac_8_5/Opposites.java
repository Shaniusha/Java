package Opposites_Attrac_8_5;

public class Opposites {
    public static boolean isLove(final int flower1, final int flower2) {
       if(flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 % 2 == 0)
            return true;
        else
            return false;

       
       // return flower1 % 2 != flower2 % 2;  
    }
    public static void main(String[] args) {
       int[]odd = {11,13};
       int[]even = {10,12};
       
       System.out.println(isLove(odd[0],even[0]));// 11,10
       System.out.println(isLove(odd[1],even[1]));//13,12
       System.out.println(isLove(even[0],even[1]));//10,12
       System.out.println(isLove(odd[0],odd[1]));  //11,13
    }

}
