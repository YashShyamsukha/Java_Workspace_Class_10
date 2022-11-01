public class Magic_Number {
    public static boolean is_magic(int n) {
        while (n > 9) {
            int s = 0;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            n = s;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int c = 0;
        for (int i = 1000; i < 2000; i++) {
            if (is_magic(i))
                c++;
        }
        System.out.println(c);
    }
}
