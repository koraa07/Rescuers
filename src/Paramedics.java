public class Paramedics extends AbstractRescuers{
    private AidKit aidKit;

    public Paramedics(String name, String position, int age, Backpack backpack, AidKit aidKit) {
        super(name, position, age, backpack);
        this.aidKit = aidKit;
    }

    public void helpPeople(){
        System.out.println("Оказать первую помощь");
    }
}
