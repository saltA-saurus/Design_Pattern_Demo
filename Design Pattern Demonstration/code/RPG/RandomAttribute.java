package RPG;

import java.util.Random;

public class RandomAttribute {
    public static String getRandomAttribute(){
        String attribute = "";
        Random r = new Random();
        int attrNum = r.nextInt(3);
        if(attrNum == 0){
            attribute = "Strength";
        }
        else if (attrNum == 1){
            attribute = "Dexterity";
        }
        else if (attrNum == 2){
            attribute = "Intelligence";
        }
        return attribute;
    }
}
