public class DrumKitTestDrive {
    public static void main(String [] args){
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playShare();
        if (d.snare == true){d.playShare();}
        d.playTopHat();
    }
}


class DrumKit{
    boolean topHat = true;
    boolean snare = true;

    void playTopHat(){
        System.out.println("динь-динь");
    }
    void playShare(){
        System.out.println("бaх-бaх-бaх");
    }

}
