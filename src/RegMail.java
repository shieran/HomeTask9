import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMail {

    public static final String STR_REGMAIL ="$55464523@sefs.ru username@mailservice.com sdfsadfsadf@fasdfd@adas.com";
    public static void mailTest() {
        Pattern pattern = Pattern.compile("" +"[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}");

        Matcher matcher = pattern.matcher(STR_REGMAIL);
        while(matcher.find())
            System.out.println(matcher.group());

    }
}
