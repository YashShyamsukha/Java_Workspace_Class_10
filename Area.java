import java.util.Scanner;

public class Area {
    public float findArea(int s){
        System.out.println("Area of Square with side "+s+" is "+(s*s));
    }
    public float findArea(int len, int brd){
        System.out.println("Area of Rectangle with length "+len+"and breadth "+brd+" is "+(len*brd));
    }
    public float findArea(float base, float height){
        System.out.println("Area of Triangle with length "+base+"and breadth "+height+" is "+(base *height));
    }
    public float findArea(float rad){
        System.out.println("Area of Circle with side "+rad+" is "+((22/7)*rad*rad));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();
        System.out.println("Enter:\n1 for Area of Square\n2 for Area of Rectangle\n3 for Area of Triangle\n4 for Area of Circle");
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the side of square:");
                int s = scanner.nextInt();
                area.findArea(s);
                break;

            case 2:
                System.out.println("Enter the sides of rectangle:");
                int len = scanner.nextInt();
                int brd = scanner.nextInt();
                area.findArea(len,brd);
                break;

            case 3:
                System.out.println("Enter the height and base of triangle:");
                float base = scanner.nextFloat();
                float height = scanner.nextFloat();
                area.findArea(base, height);
                break;

            case 4:
                System.out.println("Enter the radius of circle:");
                float rad = scanner.nextFloat();
                area.findArea(rad);
                break;

            default:
                System.out.println("Wrong Choice");

        }
    }
}
