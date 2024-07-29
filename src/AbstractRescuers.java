public abstract class AbstractRescuers {
private String name;
private String position;
private int age;
private Backpack backpack;

    public AbstractRescuers(String name, String position, int age, Backpack backpack) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.backpack = backpack;
    }
}
