import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int nomer = scanner.nextInt();
        var podezd = (nomer + 35) / 36;
        nomer -= (podezd - 1) * 36;
        var etag = (nomer + 3) / 4;

        System.out.println("podezd = " + podezd);
        System.out.println("etag = " + etag);
    }
}
