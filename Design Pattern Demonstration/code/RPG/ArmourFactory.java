package RPG;

import java.util.ArrayList;

public abstract class ArmourFactory {

    public Armour armour;

    public Armour getArmour(String rarity, int type, ArrayList<String> attributes) {
        if (type == 0) {
            armour = new Chestplate(rarity);
        }
        else if (type == 1) {
            armour = new Helm(rarity);
        }
        else if (type == 2) {
            armour = new Boots(rarity);
        }
        else if (type == 3){
            armour = new Gloves(rarity);
        }
        for (String att : attributes){
            if (att.equals("Dexterity")){
                armour = new Dexterity(armour);
            }
            else if (att.equals("Strength")){
                armour = new Strength(armour);
            }
            else if (att.equals("Intelligence")){
                armour = new Intelligence(armour);
            }
        }
        return armour;
    }
}
