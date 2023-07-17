package RPG;

import java.util.ArrayList;
import java.util.Random;

public class BossDrop extends ArmourFactory {

    public Armour makeArmour() {
        Random r = new Random();
        int type = r.nextInt(4);
        Random s = new Random();
        int rarityNum = s.nextInt(4);
        String rarity = "";
        ArrayList<String> attributes = new ArrayList<String>();
        if (rarityNum == 0){
            rarity = "Rare";
            String att1 = RandomAttribute.getRandomAttribute();
            String att2;
            do{
                att2 = RandomAttribute.getRandomAttribute();
            }while(att1.equals(att2));
            attributes.add(att1);
            attributes.add(att2);
        }
        if (rarityNum == 1){
            rarity = "Epic";
            String att1 = RandomAttribute.getRandomAttribute();
            String att2;
            String att3;
            do{
                att2 = RandomAttribute.getRandomAttribute();
            }while(att1.equals(att2));
            do{
                att3 = RandomAttribute.getRandomAttribute();
            }while(att1.equals(att3) || att2.equals(att3));
            attributes.add(att1);
            attributes.add(att2);
            attributes.add(att3);
        }
        if (rarityNum == 2){
            rarity = "Uncommon";
            String att1 = RandomAttribute.getRandomAttribute();
            attributes.add(att1);
        }
        if (rarityNum == 3){
            rarity = "Common";
        }
        return getArmour(rarity, type, attributes);
    }

}
