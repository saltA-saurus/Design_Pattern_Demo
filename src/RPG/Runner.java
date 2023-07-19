package RPG;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        // point of creation in game
        // so far, only boss drops
        BossDrop factory = new BossDrop();

        // new item, armor piece a1 (random)
        Armour a1 = factory.makeArmour();
        System.out.println(a1.getDescription());
        System.out.println();

        // new item, armor piece a2 (custom)
        ArrayList<String> attr2= new ArrayList<String>();
        attr2.add("Intelligence");
        attr2.add("Dexterity");
        Armour a2 = factory.getArmour("Very Cool", 3, attr2);
        System.out.println(a2.getDescription());
        System.out.println();

        // using decorator to add attribute
        a2 = new Strength(a2);
        System.out.println(a2.getDescription());


        }
}
