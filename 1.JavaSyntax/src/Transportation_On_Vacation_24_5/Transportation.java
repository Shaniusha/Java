package Transportation_On_Vacation_24_5;

public class Transportation {
    public static int rentalCarCost(int d) {
        // Your solution here
        int day = 40;
        int sum;
        if(d >= 7)
            sum = day * d - 50;
        else if (d >= 3)
            sum = day * d - 20;
        else if (d == 2)
            sum = day * d;
        else
            sum = day;

        return sum;
        // return d < 7 ? d < 3 ? 40 * d : 40 * d - 20 : 40 * d - 50;  решение в одну строку
    }
    public static void main(String[] args) {
        int day = 100;
        int day1 = 6;
        System.out.println(rentalCarCost(day));
        System.out.println(rentalCarCost(day1));
    }
}
