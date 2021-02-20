package QuestionOne.entity;

abstract public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor called.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n\n Name : " + this.name;
    }
}
