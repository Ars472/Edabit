package pin;

import java.util.regex.Pattern;

public class PinValidator {
    public static boolean validate(String pin){
        String regex = "^[0-9]{4}$|^[0-9]{6}$";
        return Pattern.matches(regex,pin);
    }
}
