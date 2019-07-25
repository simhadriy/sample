import java.util.*;

public class Fibonacci {
    // f(0) = 0 f(1) = 1 f(2) = 1 f(3) = 2 f(4) = 3 f(5) = 5 f(6) = 8 f(7) = 13

    // This is the logic you have to code
    // First write the requirement and develop an algorithm to solve it
    // Then code it
    // This should be your strategy
    // f(0) = 0 f(1) = 1 and f(n) = f(n-1) + f(n-2) where n>1
    public static Map<Integer, Integer> fibMap = new HashMap<Integer, Integer>();

    public static void main(String args[]) {
        System.out.println(getFibonacciResult(47));
    }

    public static int getFibonacciResult(int number) {
        int result = 0;
        if (number == 0) {
            result = 0;
        } else if (number == 1) {
            result = 1;
        } else if (number > 1) {
            if (fibMap.containsKey(number))
                return fibMap.get(number);
            else {
                result = getFibonacciResult(number - 1) + getFibonacciResult(number - 2);
                fibMap.put(number, result);
            }
        }
        return result;

    }
}