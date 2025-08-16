//Pattern-1
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

import java.util.*;

class FirstPattern {
    public static void main(String[] args) {
        int num = 7;
        int row = 1;
        while (row < num) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            row++;
        }
        while (row != 0) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            row--;
        }
    }
}