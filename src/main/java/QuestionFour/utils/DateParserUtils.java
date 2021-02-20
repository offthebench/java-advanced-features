package QuestionFour.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class DateParserUtils {
    private static final String DATE_REGEX_PATTERN = "^\\d{2}/\\d{2}/\\d{4}$";
    private static Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX_PATTERN);
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static boolean matches(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }

    public static LocalDate formatDateFromString(String date) {
        return LocalDate.parse(date, dtf);
    }

}
