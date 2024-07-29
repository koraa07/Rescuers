public class Main {
    public static void main(String[] args) {

        Firefighters firefighter1 = new Firefighters("John","Main",23,new Backpack("red",12),new Equipment("ladder",12));
        Firefighters firefighter2 = new Firefighters("John","Main",23,new Backpack("red",12),new Equipment("ladder",12));
        Firefighters firefighter3 = new Firefighters("John","Main",23,new Backpack("red",12),new Equipment("ladder",12));

        Paramedics paramedic1 = new Paramedics("Joe","Nurse",35,new Backpack("green",3),new AidKit("probiotics",23));
        Paramedics paramedic2 = new Paramedics("Joe","Nurse",35,new Backpack("green",3),new AidKit("probiotics",23));
        Paramedics paramedic3 = new Paramedics("Joe","Nurse",35,new Backpack("green",3),new AidKit("probiotics",23));



    }
}