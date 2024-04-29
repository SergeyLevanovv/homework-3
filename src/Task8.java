import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
        if (x % 2 == 0 && y % 2 == 0){
            System.out.println("YES");
        } else if(x % 2 != 0 && y % 2 != 0) {
            System.out.println("YES");
        }
    }
}
