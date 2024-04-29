import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String simvol = scanner.nextLine();

        Pattern patKirLetter = Pattern.compile("[а-яА-Я]");
        Matcher matKirLetter = patKirLetter.matcher(simvol);

        Pattern patLatLetter = Pattern.compile("[a-zA-Z]");
        Matcher matLatLetter = patLatLetter.matcher(simvol);

        Pattern patNumber = Pattern.compile("[0-9]");
        Matcher matNumber = patNumber.matcher(simvol);

        if (matLatLetter.matches()) {
            System.out.println("Латиница");
        } else if (matKirLetter.matches()) {
            System.out.println("Кирилица");
        } else if (matNumber.matches()) {
            System.out.println("Цифра");
        } else {
            System.out.println("Невозможно определить");
        }
    }
}

