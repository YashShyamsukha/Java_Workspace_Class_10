import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 6)
                    System.out.print("@ ");
                else if (j == 0 || j == 5)
                    System.out.print("@  ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
    }
}
