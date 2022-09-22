public class Main {
    public static void main (String[] args) {

        System.out.println("Задача 1");
        int apple = 291987768;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte firstApple = 8;
        System.out.println("Значение переменной firstApple с типом byte равно " + firstApple );
        short secondApple = 28759;
        System.out.println("Значение переменной secondApple с типом short равно " + secondApple);
        long thirdApple = 545748093886488L;
        System.out.println("Значение переменной thirdApple с типом long равно " + thirdApple);


        System.out.println("Задача 2");
        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        float thirdNumber = 2.786F;
        boolean fourthNumber = false;
        short fifthNumber = 569;
        short sixthNumber = - 159;
        short seventhNumber = 27897;
        byte eightNumber = 67;

        byte firstVariable = 67;
        short secondVariable = 187;
        int thirdVariable = 17589;
        long fourthVariable = 543893256896784L;
        float fifthVariable = 54.64f;
        double sixthVariable = 78.89145673244678933;
        char seventhVariable = 109;
        boolean eightVariable = true;


        System.out.println("Задача 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int amountOfPaper = 480;
        int classPaper = amountOfPaper / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + classPaper + " листов бумаги.");


        System.out.println("Задача 4");
        int productivityTwoMinutes = 16;
        int productivityOneMinute = productivityTwoMinutes / 2;
        int productivityTwentyMinutes = productivityOneMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + productivityTwentyMinutes + " штук.");
        int productivityOneDay = productivityOneMinute * 1440;
        System.out.println("За сутки машина прозвела бутылок " + productivityOneDay + " штук.");
        int productivityThreeDays = productivityOneDay * 3;
        System.out.println("За три дня машина прозвела бутылок " + productivityThreeDays + " штук.");
        int productivityMonth = productivityOneDay * 31;
        System.out.println("За месяц машина произвела бутылок " + productivityMonth + " штук." );


        System.out.println("Задача 5");
        int tinOfPaintForSchool = 120;
        int whitePaintForOneClass = 2;
        int brownPaintForOneClass = 4;
        int amountClasses = tinOfPaintForSchool / (whitePaintForOneClass + brownPaintForOneClass);
        int whitePaintForSchool = whitePaintForOneClass * amountClasses;
        int brownPaintForSchool = brownPaintForOneClass * amountClasses;
        System.out.println("В школе, где " + amountClasses + " классов, нужно " + whitePaintForSchool + " банок белой краски и " + brownPaintForSchool + " банок коричневой краски.");


        System.out.println("Задача 6");
        int amountBananas = 5;
        int gramsInOneBanana = 80;
        int gramsInAllBananas = gramsInOneBanana * amountBananas;

        int gramsInOneMilk = 105;
        int gramsInAllMilk = gramsInOneMilk * 2;

        int iceCreams = 2;
        int gramsInOneIceCream = 100;
        int gramsInAllIceCreams = iceCreams * gramsInOneIceCream;

        int amountOfEggs = 4;
        int gramsInOnEgg = 70;
        int gramsInAllEggs = amountOfEggs * gramsInOnEgg;

        int gramsInFood = gramsInAllBananas + gramsInAllMilk + gramsInAllIceCreams + gramsInAllEggs;
        System.out.println("Вес завтрака составляет " + gramsInFood + " грамм.");
        double kilogramInFood = gramsInFood / 1000.0;
        System.out.println("Вес завтрака составляет " + kilogramInFood + " килограмм.");


        System.out.println("Задача 7");
        int gramsForWeightLoss = 7000;
        int gramInDay1 = 250;
        int gramInDay2 = 500;
        int daysFofWeightLoss1 = gramsForWeightLoss / gramInDay1;
        System.out.println(daysFofWeightLoss1 + " дней потребуется на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        int daysForWeightLoss2 = gramsForWeightLoss / gramInDay2;
        System.out.println(daysForWeightLoss2 + " дней потребуется на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        int averageNumberOfDays = (daysFofWeightLoss1 + daysForWeightLoss2) /2;
        System.out.println(averageNumberOfDays + " дней потребуется на похудение в среднем.");


        System.out.println("Задача 8");
        double increaseSize = 0.1 ;
        double salaryMasha = 67760;
        double newSalaryMasha = salaryMasha + (salaryMasha * increaseSize);
        double salaryDifferenceMasha = newSalaryMasha - salaryMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей.");
        double salaryDenis = 83690;
        double newSalaryDenis = salaryDenis + (salaryDenis * increaseSize);
        double salaryDifferenceDenis = newSalaryDenis - salaryDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей.");
        double salaryKristina = 76230;
        double newSalaryKristina = salaryKristina + (salaryKristina * increaseSize);
        double salaryDifferenceKristina = newSalaryKristina - salaryKristina;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDifferenceKristina +  " рублей.");

    }
}

