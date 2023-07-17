package RPG;

public abstract class ArmorType implements Armour{
    String rarity;
    public ArmorType(String rarity){
        this.rarity = rarity;
    }

    public String getDescription(){
        String s = rarity;
        return s;
    }
}
