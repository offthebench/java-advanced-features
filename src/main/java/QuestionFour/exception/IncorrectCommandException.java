package QuestionFour.exception;

public class IncorrectCommandException extends RuntimeException {
    public IncorrectCommandException() {
        super("Command entered is incorrect!");
    }
}
