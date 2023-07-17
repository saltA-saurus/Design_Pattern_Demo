package RPG;

public class Dexterity extends Attribute {
    public Dexterity(Armour armour){
        super(armour);
    }

    @Override
    public String getDescription() {
        String s = "\n Dexterity + 5";
        return armour.getDescription() + s;
    }
}
