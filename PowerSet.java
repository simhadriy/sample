public class PowerSet {
    public static void main(String args[]) {

    char[] InputSet = {'a','b','c'};

    long pow_set_size =  
            (long)Math.pow(2, InputSet.length); 
        int counter, j; 
      
        /*Run from counter 000..0 to 
        111..1*/
        for(counter = 0; counter <  
                pow_set_size; counter++) 
        { 
            for(j = 0; j < InputSet.length; j++) 
            { 
                /* Check if jth bit in the  
                counter is set If set then  
                print jth element from set */
                int h = counter & (1 << j);
            //    System.out.println("h is " + h + " "+ "j is " + j);
                if(h > 0) 
                    System.out.print(InputSet[j]); 
            } 
              
            System.out.println("----------------------"); 
        } 
        
    }
}