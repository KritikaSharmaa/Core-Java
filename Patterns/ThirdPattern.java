public class ThirdPattern {
    public static void main(String[] args) {
        int num = 5;
        int n = num;
        int space = 0;
        for (int i = 0; i < 2 * num - 1; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }

            for (int v = 1; v <= n; v++) {
                System.out.print(v + " ");
            }
            System.out.println();
            if (i < num-1) {
                space++;
                n--;
            } else {
                n++;
                space--;
            }
        }
    }
}
