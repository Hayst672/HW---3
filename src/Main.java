public class Main {
    public static void main(String[] args) {
    int i = 4;
    byte b = 12;
    short s = 24;
    long  l = 62_123_422_321_433L;
    float f =  2.5f;
    double d = 3.14159265358979323846;
        System.out.println("значение переменной d с типом double " + d);
        System.out.println("значение переменной i с типом int " + i);
        System.out.println("значение переменной s с типом short " + s);
        System.out.println("значение переменной b с типом byte " + b);
        System.out.println("значение переменной l с типом long " + l);
        System.out.println("значение переменной f с типом float " + f);
        System.out.println();

        float f1 = 27.12f;
        long l1 = 987_678_965_549L;
        double d1 = 2.786;
        short s1 = 569;
        int i1 = -159;
        int i2 = 27897;
        byte b1 = 67;
        System.out.println();

        int luda = 23;
        int anna = 27;
        int katya = 30;
        int paper = 480;
        int papaerPerStudent = paper / (anna + luda + katya);
        System.out.println("на каждого ученика рассчитано " + papaerPerStudent +
                " листов бумаги");
        System.out.println();

        int bottlesPerMin = 16 / 2;
        int bottlesPer20Min = bottlesPerMin * 20;
        int bottlePerDay = bottlesPerMin * 60 * 24;
        int bottlePer3Day = bottlePerDay * 3;
        int bottlePer30Day = bottlePerDay * 30;
        System.out.println(" за 20 минут машина произвела " + bottlesPer20Min + " штук бутылок ");
        System.out.println(" за день машина произвела " + bottlePerDay + " штук бутылок ");
        System.out.println(" за 3 дня машина произвела " + bottlePer3Day + " штук бутылок ");
        System.out.println(" за месяц машина произвела " + bottlePer30Day + " штук бутылок ");
        System.out.println();

        int totalCans = 120;
        int brownCansPerClass = 4;
        int whiteCansPerClass = 2;
        int totalClasses = totalCans / (brownCansPerClass + whiteCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        System.out.println();

        int bananas = 5 * 80;
        double milk = 200 * 1.05;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double totalInGrams = bananas + milk + iceCream + eggs;
        double totalInKg = totalInGrams / 1000;
        System.out.println( totalInGrams + " гр ");
        System.out.println( totalInKg + " кг ");
        System.out.println();

        int kg = 7 * 1000;
        int minGrams = 250;
        int maxGrams = 500;
        int maxDays = kg / minGrams;
        int minDays = kg / maxGrams;
        int avgDays = (minDays + maxDays) / 2;
        System.out.println( " максимум дней " + maxDays);
        System.out.println( " минимум дней " + minDays);
        System.out.println( " в среднем дней " + avgDays);
        System.out.println();

        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;

        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int krisYear = kris * 12;

        double increasedMasha = masha * 1.1;
        double increasedDenis = denis * 1.1;
        double increasedKris = kris * 1.1;

        double increasedMashaYear = increasedMasha * 12;
        double increasedDenisYear = increasedDenis * 12;
        double increasedKrisYear = increasedKris * 12;

        System.out.println( "Маша теперь получает " + increasedMasha +
                " рублей. Годовой доход вырос на " + (increasedMashaYear - mashaYear) +
                " рублей");
        System.out.println( "Денис теперь получает " + increasedDenis +
                " рублей. Годовой доход вырос на " + (increasedDenisYear - denisYear) +
                " рублей");
        System.out.println( "Кристина теперь получает " + increasedKris +
                " рублей. Годовой доход вырос на " + (increasedKrisYear - krisYear) +
                " рублей");




    }

}



