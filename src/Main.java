public class Main {
    public static void main(String[] args) {


        int firstFriday = 4;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }


        int totalDistance = 42195;
        int distance = 0;

        do {
            System.out.println("Держитесь! Осталось " + (totalDistance - distance) + " метров");
            distance += 500;
        } while (distance < totalDistance);



        for (int dist = 0; dist < totalDistance; dist += 500) {
            System.out.println("Держитесь! Осталось " + (totalDistance - dist) + " метров");
        }


        int budget = 1000;
        int dailyCost = 100;
        int dayWhile = 1;
        int moneyWhile = budget;
        int daysCountWhile = 0;

        while (moneyWhile >= dailyCost) {
            if (dayWhile % 5 != 0) {
                moneyWhile -= dailyCost;
                daysCountWhile = dayWhile;
            }
            dayWhile++;
        }

        System.out.println("Количество дней парковки (while): " + daysCountWhile);


        int moneyFor = budget;
        int daysCountFor = 0;

        for (int dayFor = 1; moneyFor >= dailyCost; dayFor++) {
            if (dayFor % 5 != 0) {
                moneyFor -= dailyCost;
                daysCountFor = dayFor;
            }
        }

        System.out.println("Количество дней парковки (for): " + daysCountFor);


        double targetAmount = 12_000_000;
        double monthlySavings = 15_000;
        double totalSavings = 0;
        int month = 0;

        while (totalSavings < targetAmount) {
            month++;
            totalSavings += monthlySavings;

            if (month % 6 == 0) {
                totalSavings += totalSavings * 0.07;
            }

            System.out.printf("Месяц %d, сумма накоплений %.2f руб.%n", month, totalSavings);
        }




        int charge = 20;
        int targetCharge = 100;
        int minute = 0;
        int overheats = 0;
        int maxOverheats = 3;

        while (charge < targetCharge && overheats <= maxOverheats) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;

                if (overheats > maxOverheats) {
                    System.out.println("Критический перегрев! Зарядка прекращена.");
                    break;
                }

                System.out.println("Перегрев! Охлаждение в течение 2 минут.");
                minute += 2;
                continue;
            }

            charge += 2;
            System.out.println("Прошло " + minute + " минут. Текущий заряд: " + charge + "%");
        }

        System.out.println("Общее время зарядки: " + minute + " минут");
        System.out.println("Финальный заряд: " + charge + "%");
    }
}
