package by.epam.unit02.main;

public class Task08 {
    public static void main(String[] args) {
        int x, y;
        boolean result;
        x = 2;
        y = 2;


        if (((x <= 2 & x >= -2) & (y <= 4 & y >= 0)) | ((x <= 4 & x >= -4) & (y <= 0 && y >= -3))) {
            result = true;
            System.out.println(result + " - the dot belongs to the highlighted area");
        } else {
            result = false;
            System.out.println(result + " - the dot does not belong to the highlighted area");
        }
    }
}
