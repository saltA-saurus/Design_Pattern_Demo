package Central_AI;

public class Site2 implements Site{

    private CAI cai;
    private int key;
    private EncryptProtocol protocol;

    public Site2(CAI cai){
        this.cai = cai;
        protocol = cai.getProtocol();
        cai.add(this);
    }

    public String receiveEncryptedMessage(String msg){ //requests CAI to encrypt a message
        // site2 type specific
        if (protocol instanceof Ouroboros){
            System.out.println("Our!");
        }
        else if (protocol instanceof Cerberus) {
            System.out.println("Sir!");
        }
        return cai.sendMessage(msg, key);
    }

    public String receiveDecryptedMessage(String msg){ //requests CAI to decrypt a message
        return cai.receiveMessage(msg, key);
    }

    public void update(){ //updates the site with a new key and protocol
        key = cai.getKey();
        protocol = cai.getProtocol();
    }

    //other code should go here for site 2 to do something with

}
