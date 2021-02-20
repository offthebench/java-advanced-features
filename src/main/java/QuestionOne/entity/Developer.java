package QuestionOne.entity;

public class Developer extends Person {

    protected Language language;

    public Developer(String name) {
        super(name);
        System.out.println("Developer constructor called.");
    }

    public void updateDeveloper(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "\n\n Name : " + this.name;
    }
}
