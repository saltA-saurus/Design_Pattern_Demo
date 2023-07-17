package RPG;

public class Boots extends ArmorType{

    public Boots(String rarity){
        super(rarity);
    }

    public String getDescription(){
        return super.getDescription() + " Boots";
    }

}
