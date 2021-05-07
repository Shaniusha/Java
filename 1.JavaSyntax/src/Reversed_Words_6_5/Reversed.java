package Reversed_Words_6_5;

public class Reversed {
    public static String reverseWords(String str){
        //write your code here...
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String result = s.toString();

        return result;
    }
    public static void main(String[]args){
        String string = "I like eating";
        System.out.println(reverseWords(string));
    }
}



/*public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
        */
