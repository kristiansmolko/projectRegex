import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static boolean checkValue(String text){
        if (text == null)
            return false;
        Pattern pattern = Pattern.compile("^(([1-9]\\d+|\\d)[\\.,]([1-9]\\d|\\d[1-9])|([1-9]\\d+))$|^[0]$");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
