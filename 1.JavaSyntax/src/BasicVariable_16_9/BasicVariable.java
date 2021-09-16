package BasicVariable_16_9;

public class BasicVariable {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;

    public static void main(String[] args){
        System.out.println(name);
    }
}
//public class Tests {
//    @Test
//    public void correctValue() {
//        assertEquals("codewa.rs", BasicVariable.name);

//так было изначально
// public static String a == "code";
//  public static String b == "wa.rs";
//  public static String name == a + b;
