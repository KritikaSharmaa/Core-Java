import java.util.*;

public class SecPattern {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            int star = i;
            int space = row - i;
            while (space != 0) {
                System.out.print(" ");
                space--;
            }
            while(star!=0){
                System.out.print("* ");
                star--;
            }
            System.out.println();
        }

    }
}
