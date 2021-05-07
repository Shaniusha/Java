package TwiceAsOld;

public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears){
        //TODO: Add code here
        int on = dadYears - sonYears;    //старще на

        int son = 2 * on;    // будет вдвое <
        int dad = 2 * son;   //будет вдвое старше
        int through = dad - son;   //разница
        int will = through - dadYears;  //будет
        int ago = Math.abs(will);

        if(will >= 0)
            return will;

        else
            return ago;
    }

    public static void main(String[]args){
        int d = 30;
        int s = 0;
        int r = TwiceAsOld(d,s);

        int d1 = 30;
        int s1 = 7;
        int r1 = TwiceAsOld(d1,s1);

        int d2 = 45;
        int s2 = 30;
        int r2 = TwiceAsOld(d2,s2);

        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);

    }
}

