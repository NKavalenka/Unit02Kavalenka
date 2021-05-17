package by.epam.unit02.main;

public class Task05 {
    public static void main(String[] args) {
        float x, y , z, result;
        x = 1;
        y = 3;

        z = (float) (Math.cos(x) - Math.sin(y));

        if (z == 0) {
            System.out.println("Warning. Can't divide into zero");
        } else {
            result = (float) ((Math.sin(x) + Math.cos(y)) / z * Math.tan(x * y));
            System.out.println("Result = " + result);
        }
    }
}
