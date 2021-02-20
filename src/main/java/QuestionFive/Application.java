package QuestionFive;

public class Application {

    public static void main(String[] args) {
        UIManager manager = new UIManager();
        manager.initializeCharacterList(10, '*');
        manager.initializeUI();
    }
}
