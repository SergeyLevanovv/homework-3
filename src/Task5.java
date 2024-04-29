import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String[] nazv = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "овца", "Обезьяна", "Курица", "Собака", "Свинья"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, месяц, год(например: 5 12 1974): ");
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int god = scanner.nextInt();
        String zodiacGod = nazv[(god - 4) % 12];

        String zodiacSign = "";
        switch (m) {
            case 1:
                if (d < 20) {
                    zodiacSign = "Козерог";
                } else {
                    zodiacSign = "Водолей";
                }
                break;
            case 2:
                if (d < 19) {
                    zodiacSign = "Водолей";
                } else {
                    zodiacSign = "Рыба";
                }
                break;
            case 3:
                if (d < 21) {
                    zodiacSign = "Рыба";
                } else {
                    zodiacSign = "Овен";
                }
                break;
            case 4:
                if (d < 20) {
                    zodiacSign = "Овен";
                } else {
                    zodiacSign = "Телец";
                }
                break;
            case 5:
                if (d < 21) {
                    zodiacSign = "Телец";
                } else {
                    zodiacSign = "Близнецы";
                }
                break;
            case 6:
                if (d < 22) {
                    zodiacSign = "Близнецы";
                } else {
                    zodiacSign = "Рак";
                }
                break;
            case 7:
                if (d < 23) {
                    zodiacSign = "Рак";
                } else {
                    zodiacSign = "Лев";
                }
                break;
            case 8:
                if (d < 23) {
                    zodiacSign = "Лев";
                } else {
                    zodiacSign = "Дева";
                }
                break;
            case 9:
                if (d < 23) {
                    zodiacSign = "Дева";
                } else {
                    zodiacSign = "Весы";
                }
                break;
            case 10:
                if (d < 23) {
                    zodiacSign = "Весы";
                } else {
                    zodiacSign = "Скорпион";
                }
                break;
            case 11:
                if (d < 23) {
                    zodiacSign = "Скорпион";
                } else {
                    zodiacSign = "Стрелец";
                }
                break;
            case 12:
                if (d < 22) {
                    zodiacSign = "Стрелец";
                } else {
                    zodiacSign = "Козерог";
                }
                break;
        }

        System.out.println("Знак: " + zodiacSign);
        System.out.println("Год: " + zodiacGod);
    }
}

