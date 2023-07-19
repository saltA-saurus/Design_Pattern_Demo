package RPG;

public class Intelligence extends Attribute {
    public Intelligence(Armour armour){
        super(armour);
    }

    @Override
    public String getDescription() {
        String s = "\n Intelligence + 5";
        return armour.getDescription() + s;
    }
}
