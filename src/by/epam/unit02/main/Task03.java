package by.epam.unit02.main;

public class Task03 {
    public static void main(String[] args) {
        int t, hh, mm, ss ;
        t = 8790;

        hh = t / 3600;
        t = t - hh * 3600;
        mm = t / 60;
        t = t - mm * 60;
        ss = t;
        System.out.println(hh + "ч" + " " + mm + "мин" + " " + ss + "с");
    }
}
