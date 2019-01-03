import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMail {

    public static final String STR_REGMAIL ="$55464523@sefs.ru username@mailservice.com";
    public static void mailTest() {
        Pattern pattern = Pattern.compile("[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))");

        Matcher matcher = pattern.matcher(STR_REGMAIL);
        while(matcher.find())
            System.out.println(matcher.group());

    }
}
