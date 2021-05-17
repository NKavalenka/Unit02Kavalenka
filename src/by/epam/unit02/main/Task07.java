package by.epam.unit02.main;

public class Task07 {
    public static void main(String[] args) {
        float x, y, z;
        x = 1;
        y = -2;
        z = 0;

        if (x >= 0) {
            x = (float) Math.pow(x, 2);
        } else {
            x = (float) Math.pow(x, 4);
        }
        if (y >= 0) {
            y = (float) Math.pow(y, 2);
        } else {
            y = (float) Math.pow(y, 4);
        }
        if (z >= 0) {
            z = (float) Math.pow(z, 2);
        } else {
            z = (float) Math.pow(z, 4);
        }
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
    }
}
