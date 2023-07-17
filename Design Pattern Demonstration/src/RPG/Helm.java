package RPG;

public class Helm extends ArmorType{

    public Helm(String rarity){
        super(rarity);
    }

    public String getDescription(){
        return super.getDescription() + " Helm";
    }

}
