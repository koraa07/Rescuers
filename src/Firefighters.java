public class Firefighters extends AbstractRescuers {
    private Equipment equipment;

    public Firefighters(String name, String position, int age, Backpack backpack, Equipment equipment) {
        super(name, position, age, backpack);
        this.equipment = equipment;
    }

    public void putOutFire(){
        System.out.println("Тушить пожар");
    }


}
