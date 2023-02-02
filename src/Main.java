public class Main {
    public static void main(String[] args) {
        /*Task1*/
        int i = 55;
        byte b = 5;
        short s = 40;
        long l = 110;
        float f = 1.5f;
        double d = 8.555d;
        System.out.println("Значение переменной int с типом равно" + i);
        System.out.println("Значение переменной int с типом равно" + b);
        System.out.println("Значение переменной int с типом равно" + s);
        System.out.println("Значение переменной int с типом равно" + l);
        System.out.println("Значение переменной int с типом равно" + f);
        System.out.println("Значение переменной int с типом равно" + d);
        System.out.println("Значение переменной int с типом равно" + i);
        System.out.println();
        /*Task2*/

        double d1 = 27.12;
        long l1 = 987678965549L;
        double d2 = 2.786;
        int i1 = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;
        System.out.println(d1);
        System.out.println(l1);
        System.out.println(d2);
        System.out.println(i1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(b1);
        System.out.println();
        /*Task3*/
        int ludmilaPavlovna =23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short totalSheets = 480;
        int paperFEStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperFEStudent + " листов бумаги");
        System.out.println();
        /*Task4*/
        int performanceEachMin = 16/2;
        int performanceEach20Min = 20 * performanceEachMin;
        int performanceEveryDay = 24 * 60 * performanceEachMin;
        int performanceEvery3Days = 3 * performanceEveryDay;
        int performanceEveryMonth = 30 * performanceEveryDay;
        System.out.println("За 20 минут машина произвела " + performanceEach20Min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + performanceEveryDay + " штук бутылок" );
        System.out.println("За 3 дня машина произвела " + performanceEvery3Days + " штук бутылок");
        System.out.println("За 30 дней машина произвела " + performanceEveryMonth + " штук бутылок");
        System.out.println();
        /*Task5*/
        int jarCount = 120;
        int whiteCountEvClass = 2;
        int brownCountEvClass = 4;
        int classCount = jarCount / (whiteCountEvClass + brownCountEvClass);
        int totalWhiteCount = whiteCountEvClass * classCount;
        int totalBrownCount = brownCountEvClass * classCount;
        System.out.println("В школе, где " + classCount + " классов, нужно " + totalWhiteCount +
                " банок белой краски и " + totalBrownCount + " банок коричневой краски.");
        System.out.println();
        /*Task*/
        int bananaCount = 5;
        int bananaGramsPerOne = 80;
        int milkCountMl = 200;
        double milkInOneHundredGrams = 1.05;
        int iseCreamCount = 2;
        int iseCreamPerOne = 100;
        int eggsCount = 4;
        int EggGramsPerOne = 70;
        int totalBananasGram = bananaCount * bananaGramsPerOne;
        double totalMilkGrams = milkCountMl * milkInOneHundredGrams;
        int totalIseCreamGrams = iseCreamCount * iseCreamPerOne;
        int eggsTotalGrams = eggsCount * EggGramsPerOne ;
        double totalGrams = totalBananasGram + totalMilkGrams + totalIseCreamGrams + eggsTotalGrams;
        double totalKg = totalGrams / 1000;
        System.out.println(totalGrams + "гр");
        System.out.println(totalKg + "кг");
        System.out.println();
        /*Task7*/
        int weightKg = 7;
        int weightGr = 7 * 1000;
        int minLostDayWeightGr = 250;
        int maxLostDayWeightGr = 500;
        int minDays = weightGr / minLostDayWeightGr;
        int maxDays = weightGr /maxLostDayWeightGr;
        double averageDays = (minDays + maxDays ) / 2d;
        System.out.println(minDays);
        System.out.println(maxDays);
        System.out.println(averageDays);
        System.out.println();
        /*Task8*/
        int mashaSalary = 67760;
        int denSalary = 83_690;
        int krisSalary = 76_230;
        float mashaIncreasedSalary = mashaSalary * 1.1f;
        float denIncreasedSalary = denSalary * 1.1f;
        float krisIncreasedSalary = krisSalary * 1.1f;
        int yearMashaSalary = mashaSalary * 12;
        int yearDenSalary = denSalary * 12;
        int yearKrisSalary = krisSalary * 12;
        float yearMashaIncreasedSalary = mashaIncreasedSalary * 12;
        float yerDenIncreasedSalary = denIncreasedSalary * 12;
        float yearKrisIncreasedSalary = krisIncreasedSalary * 12;
        System.out.println("Маша теперь получает " + mashaIncreasedSalary + " рублей. Годовой доход вырос на "
        + (yearMashaIncreasedSalary - yearMashaSalary) + " рублей.");
        System.out.println("Денис теперь получает " + denIncreasedSalary + " рублей. Годовой доход вырос на "
                + (yerDenIncreasedSalary - yearDenSalary ) + " рублей.");
        System.out.println("Кристина теперь получает " + krisIncreasedSalary + " рублей. Годовой доход вырос на "
                + (yearKrisIncreasedSalary - yearKrisSalary) + " рублей.");
















    }
}