//Find the maximum and minimum number in a list using streams.

import java.util.List;

public class Quest2 {
   public static void main(String[] args) {
    List<Integer> numbers = List.of(11, 42, 13, 2, 5);
    int maxNum = numbers.stream().max((a,b)->a-b).get();
    int minNum = numbers.stream().min((a,b)->a-b).get();
    System.out.println("Minimum number: " + minNum);
    System.out.println("Maximum number: " + maxNum);
   } 
}
