package Quarter_Of_The_Year_1_5;

public class Quarter {
    public static int quarterOf(int month) {
        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
            int qu;
            double j = month / 3.0;
            if (j > 3 && j <= 4) {
                qu = 4;
               // System.out.println(months[month - 1] + " 4  quarter");
            } else if (j > 2 && j <= 3) {
                qu = 3;
               // System.out.println(months[month - 1] + " 3  quarter");
            } else if (j > 1 && j <= 2) {
                qu = 2;
               // System.out.println(months[month - 1] + " 2  quarter");
            }else {
                qu = 1;
               // System.out.println(months[month - 1] + " 1  quarter");
            }
                return qu ;
        }


    public static void main(String[] args) {
       System.out.println (quarterOf(8));

    }
}

