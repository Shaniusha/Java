package AreaOrPerimeter_26_4;

public class Area {
    public static int areaOrPerimeter (int l, int w) {
        // code away...               // return a == b ? a * b : 2 * ( a + b )
       int perimeterS = l * w;
       int perimeterR = (l + w) * 2;

       if(l == w)
           return perimeterS;
       else if (l != w)
           return perimeterR;
       else
           return 0;
    }
    public static void main (String[]args){
      int squareL = 4;
      int squareW = 4;
      System.out.println(areaOrPerimeter(squareL,squareW));

      int rectangleL = 6;
      int rectangleW = 10;
      System.out.println(areaOrPerimeter(rectangleL,rectangleW));
    }
}


    //    assertEquals(16, Solution.areaOrPerimeter(4 , 4));
    //    assertEquals(32, Solution.areaOrPerimeter(6 , 10));

