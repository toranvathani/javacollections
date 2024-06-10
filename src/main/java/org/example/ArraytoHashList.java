import java.util.*;
import java.util.stream.*;

 class ArraytoHashList {
     public static <T> Set<T> convertArrayToSet(T array[])
     {
         return Arrays.stream(array).collect(
                 Collectors.toSet());
     }

     public static void main(String args[])
     {
         String array[] = { "Vote", "for India", "A Public Right" };


         System.out.println("Array: " + Arrays.toString(array));

         Set<String> set = convertArrayToSet(array);

         System.out.println("Set: " + set);
     }
 }

