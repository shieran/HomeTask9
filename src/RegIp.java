import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegIp {

    public static final String STR_REGEX ="001.100.05.001 192.168.1.1";
    public static void ipTest() {
        Pattern pattern = Pattern.compile("(25[0-5]\\.|2[0-4]\\d\\.|1\\d\\d\\.|[1-9]\\d\\.|\\d\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)");
        Matcher matcher = pattern.matcher(STR_REGEX);
        while(matcher.find())
            System.out.println(matcher.group());

    }

}
