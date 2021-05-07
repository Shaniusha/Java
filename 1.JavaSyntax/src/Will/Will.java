package Will;

public class Will {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        //return distanceToPump <= mpg * fuelLeft;

        double t2 = mpg * fuelLeft ;
        if (distanceToPump <= t2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[]args){
        double d = 50;
        double m = 25;
        double f = 2;
        zeroFuel(d,m,f);
        System.out.println(zeroFuel(d,m,f));

        double d1 = 100;
        double m2 = 50;
        double f3 = 1;
        System.out.println(zeroFuel(d1,m2,f3));

    }
}

