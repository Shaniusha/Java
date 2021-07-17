package The_Wide_Mouthed_frog_17_7;

public class The_Wide_Mouthed {

        public static String mouthSize(String animal){
            // your code here
            String s = "alligator";
            if (animal.equalsIgnoreCase(s))
            return "small";
            else return "wide";

            // return "alligator".equals(animal.toLowerCase()) ? "small" : "wide"; reshenie
            // odny str
        }

    public static void main(String[] args) {
        String a = "toucan";
        String b = "ant bear";
        String c = "alligator";
        String d = "ALLIGATOR";
        System.out.println(mouthSize(a));
        System.out.println(mouthSize(b));
        System.out.println(mouthSize(c));
        System.out.println(mouthSize(d));

        }
    }



