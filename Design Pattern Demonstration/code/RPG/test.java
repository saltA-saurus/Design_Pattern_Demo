package RPG;

public class test {
    public static void main(String[] args) {

        BossDrop factory = new BossDrop();
        Armour t = factory.makeArmour();
        System.out.println(t.getDescription());

        }
}
