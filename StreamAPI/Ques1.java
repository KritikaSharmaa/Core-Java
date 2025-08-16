//Sum all numbers in a list using streams.
import java.util.*;

public class Ques1{
    public static void main (String[] args){
       List<Integer>numbers = Arrays.asList(1, 2, 3, 4, 5);
       int sum = numbers.stream().reduce(Integer::sum).get();
       System.out.println("Sum of all numbers: " + sum);
    }
}