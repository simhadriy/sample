
import java.io.*;
import java.util.*;

public class TestProgram {
    public static String LC = "{";
    public static String LR = "(";
    public static String LS = "[";
    public static String RC = "}";
    public static String RR = ")";
    public static String RS = "]";
    public static Map<String, String> orientationMap = new HashMap<String, String>();

    static {

        orientationMap.put(LC, "L");
        orientationMap.put(LR, "L");
        orientationMap.put(LS, "L");
        orientationMap.put(RC, "R");
        orientationMap.put(RC, "R");
        orientationMap.put(RC, "R");

    }

    public static void main(String args[]) {
        System.out.println("Test");

        String testString = "([)]";
        char[] testStringCharacterArray = testString.toCharArray();
        int testStringCharacterArrayLength = testStringCharacterArray.length;
        System.out.println(testStringCharacterArrayLength);
      //  System.out.println(Arrays.toString(testStringCharacterArray));
       Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < testStringCharacterArrayLength; i++) {
            System.out.println(stack);
            if (testStringCharacterArray[i] == '(' || testStringCharacterArray[i] == '['
                    || testStringCharacterArray[i] == '{') {
                stack.push(testStringCharacterArray[i]);
            } else {
                if(stack.size() ==0)
                {
                    break;
                }
                if ((testStringCharacterArray[i] == ')' && stack.peek() != '(')
                        || (testStringCharacterArray[i] == ']' && stack.peek() != '[')
                        || (testStringCharacterArray[i] == '}' && stack.peek() != '{')) {
                    break;
                }
                else {
                    stack.pop();
                }
            }

        }
        System.out.println(stack.size());

}
}