package MultiplicationTableForNumber_11_5;

public class Multiplication {
    public static String multiTable(int num) {
        String s = "";
        String s1= "";
        for (int i = 1; i <= 10; i++) {
            int t = i * num;
            if(i == 10 )
                s1 = i + " * " + num  + " = " + t;
            else
               s1 = i + " * " + num  + " = " + t + "\n";
            s = s + s1;

        }
        return s;
    }
    public static void main(String[] args) {

        int n = 7;
        System.out.println(multiTable(n));
        }
    }

//    @Test
//    public void basicTests() {
//        Tester.doTest(5, "1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50");
//        Tester.doTest(1, "1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10");
//--------------------------------------------------------------------------------------------------------
