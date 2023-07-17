package Central_AI;

public class Runner {
    public static void main(String[] args) {
        // initialize a CAI, and two sites
        CAI cai = new CAI();
        Site site1 = new Site1(cai);
        Site site2 = new Site2(cai);
        // sets protocol for CAI
        cai.setProtocol();

        //initialize messages
        String s1 = "helloworld";
        String s2 = "cloudyday";

//        String s3 = "helloworld";
//        String s4 = "cloudyday";

        // testing encryption
        System.out.println(site1.receiveEncryptedMessage(s1));
        System.out.println(site1.receiveEncryptedMessage(s2));
        s1 = site1.receiveEncryptedMessage(s1);
        s2 = site1.receiveEncryptedMessage(s2);
        System.out.println(site1.receiveDecryptedMessage(s1));
        System.out.println(site1.receiveDecryptedMessage(s2));


        // debugging
//        System.out.println();
//        System.out.println(site2.receiveEncryptedMessage(s3));
//        System.out.println(site2.receiveEncryptedMessage(s4));
//        s3 = site2.receiveEncryptedMessage(s3);
//        s4 = site2.receiveEncryptedMessage(s4);
//        System.out.println(site2.receiveDecryptedMessage(s3));
//        System.out.println(site2.receiveDecryptedMessage(s4));


    }
}
