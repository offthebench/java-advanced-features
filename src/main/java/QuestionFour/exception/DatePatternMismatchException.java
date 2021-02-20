package QuestionFour.exception;

public class DatePatternMismatchException extends RuntimeException {

    public DatePatternMismatchException() {
        super("Date entered is incorrect. Use correct date Pattern : DD/MM/YYYY.");
    }
}
