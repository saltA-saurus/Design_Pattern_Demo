package RPG;

public class Chestplate extends ArmorType{

    public Chestplate(String rarity){
        super(rarity);
    }

    public String getDescription(){
        return super.getDescription() + " Chestplate";
    }

}
