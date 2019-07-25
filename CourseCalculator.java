import java.util.Arrays;
import java.util.*;

public class CourseCalculator {
    public static void main(String args[]) {

        System.out.println("Test");

     


        Map<String,List<String>> couresePreRequisiteMap = new HashMap<String,List<String>>();

        couresePreRequisiteMap.put("CSC300",Arrays.asList("CSC100","CSC200"));
        couresePreRequisiteMap.put("CSC200",Arrays.asList("CSC100"));
        couresePreRequisiteMap.put("CSC100",Arrays.asList());
        System.out.println(couresePreRequisiteMap);
        
        /*Tested my file */

        System.out.println(couresePreRequisiteMap);




    }
    
    public static getUserName() {
        System.out.println(couresePreRequisiteMap);
    }
}
