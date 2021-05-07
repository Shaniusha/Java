package Keep_Hydrated_4_5;

public class Keep {
    public static int Liters(double time) {
        double litre = 0.5;    //за один час литров
        double liters = time * litre;
        liters = Math.floor(liters);
        return (int) liters;              //приведение типа double в тип int

        //return (int) (time * 0.5);       решение в одну строку
    }
    public static void main(String[]args){
        double hour = 16.20; //16 часов
        System.out.println ( Liters(hour));
    }
}


