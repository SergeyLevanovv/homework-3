import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное:");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Попугай");
        System.out.println("4. Хомячок");
        System.out.println("5. Медвежонок");
        System.out.println("6. Игуана");
        System.out.println("7. Рыбки");
        System.out.println("8. Морская свинка");
        System.out.println("9. Минипиг");
        System.out.println("10. Лягушка");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("мяу-мяу");
                break;
                case 2:
                System.out.println("гав-гав");
                break;
            case 3:
                System.out.println("кар-кар");
                break;
            case 4:
                System.out.println("ниф-ниф");
                break;
            case 5:
                System.out.println("гр-гр");
                break;
            case 6:
                System.out.println("м-м");
                break;
            case 7:
                System.out.println("буль-буль");
                break;
            case 8:
                System.out.println("фыр-фыр");
                break;
            case 9:
                System.out.println("пых-пых");
                break;
            case 10:
                System.out.println("ква-ква");
                break;
            default:
                System.out.println("Выберите животное из списка:");
                break;

        }
        }
    }
