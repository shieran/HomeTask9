import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegLane {

    public static void lineTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку для проверки");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z, А-Я].*[.]");
        Matcher matcher = pattern.matcher(line);
        boolean isOk = matcher.matches();
        if (isOk){
            System.out.println("проверка прошла успешно");
        }else {
            System.out.println("проверка не пройдена");
        }
    }
}
