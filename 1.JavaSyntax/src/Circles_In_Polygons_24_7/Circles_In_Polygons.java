package Circles_In_Polygons_24_7;// круг и полигон

public class Circles_In_Polygons {
    int sides;//стороны
    int sideLength;//длина стороны

    public Circles_In_Polygons(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){//диаметр круга
        //Your code comes here
        double MAX_VALUE = 1.7976931348623157E308;

        return sides;
    }


}
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class PolygonTest {
//
//    @Test
//    public void test1(){
//        //Square with sides of 5 units
//        Polygon poly=new Polygon(4, 5);
//        assertEquals("5.000", String.format("%.3f", poly.circleDiameter()));
//    }
//
//    @Test
//    public void test2() {
//        //Octogon with sides of 9 units
//        Polygon poly=new Polygon(8, 9);
//        assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
//    }
//
//    @Test
//    public void test3() {
//        //Triangle with sides of 4 units
//        Polygon poly=new Polygon(3, 4);
//        assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));
//    }
//}
