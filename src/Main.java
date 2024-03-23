public class Main {
    public static void main(String[] args) {
        //Задание 1
        int empire = 10000000;
        byte a = 12;
        short crouch = 1337;
        long lion = 57L;
        float nice = 3.22f;
        double trouble = 14.9320d;
        System.out.println("Значение переменной empire с типом int равно "+empire);
        System.out.println("Значение переменной a с типом byte равно "+a);
        System.out.println("Значение переменной crouch с типом short равно "+crouch);
        System.out.println("Значение переменной lion с типом long равно "+lion);
        System.out.println("Значение переменной nice с типом float равно "+nice);
        System.out.println("Значение переменной trouble с типом double равно "+trouble);
        //Задание 2
        float fl1 = 27.12f;
        long ln1 = 987678965549L;
        float fl2 = 2.786f;
        short sh1 = 569;
        short sh2 = -159;
        short sh3 = 27897;
        byte bt1 = 67;
        //Задание 3
        byte lpKids = 23;
        byte asKids = 27;
        byte eaKids = 30;
        short paper = 480;
        short paperKids = (short) (paper / (lpKids+asKids+eaKids));
        System.out.println("На каждого ученика рассчитано "+paperKids+" листов бумаги");
    }
}