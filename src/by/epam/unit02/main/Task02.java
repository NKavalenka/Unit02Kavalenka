package by.epam.unit02.main;

public class Task02 {
    public static void main(String[] args) {
        int x, y, z;
        x = 2;
        y = 3;
        z = x;

        if (x < y) {
            x = y;
            y = z;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
