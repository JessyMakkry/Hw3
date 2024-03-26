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
        byte paperKids = (byte) (paper / (lpKids+asKids+eaKids));
        System.out.println("На каждого ученика рассчитано "+paperKids+" листов бумаги");
        //Задание 4
        byte bottler = 16;
        byte baseTime = 2;
        byte time = 20;
        int bottleInTime = (bottler/baseTime) * time;
        System.out.println("За "+time+" минут машина произвела "+bottleInTime+" штук бутылок");
        time = 1;
        bottleInTime = (bottler/baseTime) * time*24*60;
        System.out.println("За "+time+" сутки машина произвела "+bottleInTime+" штук бутылок");
        time = 3;
        bottleInTime = (bottler/baseTime) * time*24*60;
        System.out.println("За "+time+" дня машина произвела "+bottleInTime+" штук бутылок");
        time = 1;
        bottleInTime = (bottler/baseTime) * time*24*60*30;
        System.out.println("За "+time+" месяц машина произвела "+bottleInTime+" штук бутылок");
        //Задание 5
        byte allCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        byte classes = (byte) (allCans/(whiteCansPerClass+brownCansPerClass));
        byte whiteCans = (byte) (whiteCansPerClass * classes);
        byte brownCans = (byte) (brownCansPerClass * classes);
        System.out.println("В школе, где "+classes+" классов, нужно "
                + whiteCans + " банок белой краски и " + brownCans +
                " банок коричневой краски");
        //Задание 6
        byte banana = 80;
        byte milk = 105;
        byte cream = 100;
        byte eggs = 70;
        short mealGramms = (short) (5*banana + 2 * milk + 2*cream + 4*eggs);
        float mealKgramns = mealGramms / 1000f;
        System.out.println("Спортзавтрак весит "
                + mealGramms + " грамм, или "+ mealKgramns + " килограмм");
        //Задание 7
        short min = 250;
        short max = 500;
        short goal = 7000;
        byte dayMin = (byte) (goal/min);
        byte dayMax = (byte) (goal/max);
        System.out.println("При похудении на 250 грамм в день потребуется "
                + dayMin + " дней, а на 500 грамм - "+ dayMax + " дней");
        //Задание 8
        int mariaOld = 67760;
        int denisOld = 83690;
        int krisOld = 76230;
        float proc = 0.1f;
        float mariaNew = (float) (mariaOld * (1f+proc)); //Несмотря на то, что в результате должны получиться целые числа, я выбрал float, поскольку речь идет о зарплатах.
        float denisNew = (float) (denisOld * (1f+proc));
        float krisNew = (float) (krisOld * (1f+proc));
        float mariaDif = (float) (mariaNew-mariaOld);
        float denisDif = (float) (denisNew-denisOld);
        float krisDif = (float) (krisNew-krisOld);
        System.out.println("Маша теперь получает "
                + mariaNew + " рублей. Годовой доход вырос на "
                + mariaDif + "рублей.Денис теперь получает "
                + denisNew + " рублей. Годовой доход вырос на "
                + denisDif + "рублей. Кристина теперь получает "
                + krisNew + " рублей. Годовой доход вырос на "
                + krisDif + "рублей.");
    }
}