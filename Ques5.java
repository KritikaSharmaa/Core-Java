//Remove duplicates from a list of integers using streams.

import java.util.List;

public class Ques5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(6, 1, 2, 5,3,  4);
        System.out.println(numbers.stream().sorted((a,b)-> b-a).toList());
    }
}
