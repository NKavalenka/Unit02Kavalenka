package by.epam.unit02.main;

public class Task09 {
    public static void main(String[] args) {
        int x;
        double fx;
        x = -3;

        if (x <= -3) {
            fx = 9;
            System.out.println("F(x) = " + fx);
        } else if (x > 3) {
            fx = 1 / (Math.pow(x, 2) + 1);
            System.out.println("F(x) = " + fx);
        } else {
            System.out.println("Incorrect range for parameter is used. Please use value less or equal -3 or more than 3");
        }
    }// Молодец
}
