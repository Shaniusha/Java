package Remove_Exclamation_Marks_4_5;

public class Remove {
    static String removeExclamationMarks(String s) {

       String result = s.replace("!","");
         return result;
    }
        public static void main (String[]args){
            String str = "Hello,World!o!";
            System.out.println(removeExclamationMarks(str));
        }
    }

