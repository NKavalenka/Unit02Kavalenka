package by.epam.unit02.main;

public class Task06 {
    public static void main(String[] args) {
        double m, n, fractional;
        int whole, min, max;
        m = 300;
        n = 17;

        whole = (int) (m / n);
        fractional = (m / n) - whole;
        min = whole % 10;
        max = (int) (fractional * 10);
        System.out.println("The last number of the whole is " + min);
        System.out.println("The first number of the fractional is " + max);
    }
}
