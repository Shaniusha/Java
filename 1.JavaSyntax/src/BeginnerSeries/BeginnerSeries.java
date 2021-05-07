package BeginnerSeries;

public class BeginnerSeries {
    public static int paperWork(int n, int m) {
        int paperwork = m * n;
        if (n < 0 || m < 0)
            return 0;
            //Happy Coding! ^_^
        else
            return paperwork;


    }
    public static void main(String[]args){

        int n = 20;
        int m = 40;
        int paperwork = paperWork(n,m);
        System.out.println(paperwork);

    }
}
