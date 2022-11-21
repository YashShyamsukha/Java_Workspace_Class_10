import java.util.Scanner;

public class Pronic_number {
    public int is_pronic(int n) {
        for (int i = 1; i < n; i++) {
            if (i * (i + 1) == n)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Pronic_number pronic_number = new Pronic_number();
        if (pronic_number.is_pronic(12) == 1)
            System.out.println("Pronic");
        else
            System.out.println("not pronic");
    }
}
