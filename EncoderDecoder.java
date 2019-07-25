
import java.io.*;
import java.util.*;

public class EncoderDecoder {

    public static void main(String args[]) {

        String tesString = "AAAABBBCCDAA";
        String encodedString = encode(tesString);
        System.out.println(encodedString);

    }

    public static String encode(String inputString) {
        char[] InputStringCharacterArray = inputString.toCharArray();
        int charArrayLength = InputStringCharacterArray.length;
        StringBuffer sb = new StringBuffer();
        int currentCharCount = 1;
        char currentChar = InputStringCharacterArray[0];
        for (int i = 1; i < charArrayLength; i++) {
            if (currentChar == InputStringCharacterArray[i]) {
                currentCharCount++;
                System.out.println(currentChar + " "+currentCharCount);
            } else {
                sb.append(currentCharCount).append(currentChar);
                System.out.println(sb);
                currentChar = InputStringCharacterArray[i];
                currentCharCount = 1;
                System.out.println(currentChar + " "+currentCharCount);
            }
           
        }
        sb.append(currentCharCount).append(currentChar);

        return sb.toString();

    }

    public static String decode(String inputString) {
        return "";
    }

}
