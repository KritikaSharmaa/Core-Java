import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques7 {
    //Given a sentence, count the occurrence of each word.
    public static void main(String[] args) {
        String sentence = "hello world hello everyone everyone everyone";
    Arrays.asList(sentence.split(" ")).stream().collect(Collectors.groupingBy(word-> word, Collectors.counting()))
            .forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
