package by.epam.unit02.main;

public class Task04 {
    public static void main(String[] args) {
        int ac, bc;
        double ab;
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 2;

        ac = x2 - x1;
        bc = y2 - y1;
        ab = Math.sqrt(Math.pow(ac, 2) + Math.pow(bc, 2));
        System.out.println("Distance = " + ab);
    }
}
