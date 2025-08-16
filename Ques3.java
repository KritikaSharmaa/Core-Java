//Count how many strings in a list start with a certain letter.

import java.util.List;

public class Ques3 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apricot", "cherry", "avocado");
        char letter = 'a';
        int count = words.stream().filter(word->word.charAt(0)==letter).toList().size();
        System.out.println("Number of words starting with '" + letter + "': " + count);
    }
}
