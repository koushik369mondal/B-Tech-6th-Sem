package CW;

public class lec3 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;

        int x2 = 4;
        int y2 = 5;

        int x3 = 6;
        int y3 = 7;

        int m1 = (y2 - y1) / (x2 - x1);
        int m2 = (y3 - y2) / (x3 - x2);

        if (m1 == m2) {
            System.out.println("The points are collinear");
        } else {
            System.out.println("The points are not collinear");
        }
    }
}
