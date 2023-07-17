package RPG;

public abstract class Attribute extends ArmourDecorator{

    public Attribute(Armour armour){
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription();
    }
}
