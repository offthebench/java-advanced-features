package QuestionOne.entity;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name) {
        super(name);
        System.out.println("Java Developer constructor called.");
        this.language = Language.JAVA;
    }

    public void updateDeveloper(String name, Language language) {
        super.updateDeveloper(name);
        this.language = language;
    }

    @Override
    public String toString() {
        return "\n\n Name : " + this.name
                +"\n Language : " + this.language;
    }
}
