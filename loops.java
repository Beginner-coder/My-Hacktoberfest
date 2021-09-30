public class loops {
    public static void main(String[] args) {
        int b = 0;
        System.out.println("While");
        while (b < 5) {
            System.out.println(b);
            b++;
        }
        b = 0;
        System.out.println("Do while");
        do {
            System.out.println(b);
            if (b == 3)
                break;
            b++;

        }
        while (b < 5);

        System.out.println("For loop");
        for (b = 0; b < 5; b++) {

            if (b == 2) {
                continue;
            }
            System.out.println(b);
        }
    }
}