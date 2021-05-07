package WillThereBeEnoughSpace;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait) {
        // your code here

        int sum = on + wait - cap;
        if (on + wait <= cap)
            return 0;
        else
            return sum;
    }

    public static void main(String[]args){
        int c = 100;
        int o = 50;
        int w = 60;
        int sum = enough(c,o,w);
        System.out.println(sum);
    }

}
