//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task # 1
        System.out.println(" Task # 1");
        int firstFriday = 2;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0)
                System.out.println(" Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
// Task # 2
        System.out.println();
        System.out.println(" Task # 2 ");
        int distance = 42195;
        int pathTraveled = 0;
        int step = 500;
        do {
            System.out.println(" Держитесь! Осталось " + (distance - pathTraveled) + " метров ");
            if (pathTraveled % step == 0) {
                pathTraveled += step;
            }
        }
        while (pathTraveled <= distance);
        System.out.println();
        int distance1 = 42195;
        int step1 = 500;
        for (int pathTraveled1 = 0; pathTraveled1 <= distance1; pathTraveled1 += step1) {
            System.out.println(" Держитесь! Осталось " + (distance1 - pathTraveled1) + " метров ");
        }
// Task # 3
        System.out.println();
        System.out.println(" Task # 3 ");
        int budget = 787;
        int freDay = 5;
        int costDay = 100;
        int dey = 0;
        while (budget > 100) {
            dey++;
            freDay++;
            if (freDay % 5 == 0) {
                continue;
            }
            budget = budget - costDay;
        }
        System.out.println(" На " + dey + " дней можно оставить автомобиль. ");
        System.out.println();
        int budget1 = 987;
        int freDay1 = 5;
        int costDay1 = 100;
        int dey1 = 0;
        for (; budget1 > 100; dey1++) {
            freDay1++;
            if (freDay1 % 5 == 0) {
                continue;
            }
            budget1 = budget1 - costDay1;
        }
        System.out.println(" На " + dey1 + " дней можно оставить автомобиль. ");
        // Task # 4
        System.out.println();
        System.out.println(" Task # 4 ");
        int month = 0;
        int total = 0;
        int replenishment = 15000;
        int contribution = 12000000;
        while (true) {
            total = total + replenishment;
            month++;
            if (month % 6 == 0) {
                total = (int) (total * 0.07) + total;
            }
            System.out.println(" За " + month + " месяц накопленно " + total);
            if (total >= contribution) {
                break;
            }
        }
        // Task # 5
        System.out.println();
        System.out.println(" Task # 5 ");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge <= 100) {
            minute++;
            if (overheats == 3) {
                System.out.println(" Зарядка прекращена. Текущий заряд:" + charge + " % ");
                break;
            } else if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                System.out.println(" Количество перегревов " + overheats);
                continue;
            }
            charge += 2;
        }
        System.out.println(" Время зарядки составило " + minute + " минут ");
    }
}






