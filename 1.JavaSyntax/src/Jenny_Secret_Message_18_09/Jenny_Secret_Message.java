package Jenny_Secret_Message_18_09;

public class Jenny_Secret_Message {
    public static String greet(String name) {
        if(name.equals("Johnny")) {
            return "Hello, my love!";
        }
        else
            return String.format("Hello, %s!", name);
    }
    public static void main(String[] args){
        String s = "Johnny";
        System.out.println(greet(s));
        String q = "Simon";
        System.out.println(greet(q));
    }
}
// было так
//public static String greet(String name) {
//
//    return String.format("Hello, %s!", name);
//    if(name.equals("Johnny")){
//        return "Hello, my love!";
