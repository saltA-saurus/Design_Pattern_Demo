package RPG;

public class Strength extends Attribute {
    public Strength(Armour armour){
        super(armour);
    }

    @Override
    public String getDescription() {
        String s = "\n Strength + 5";
        return armour.getDescription() + s;
    }
}
