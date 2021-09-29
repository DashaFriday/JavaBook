package Exercises;

public class DVDplayer {

    boolean canRecord = false;

    void recordDVD() {
        System.out.println("идет запись DVD");
    }

    void playDVD() {
        System.out.println("DVD проигрывается");
    }

}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDplayer d = new DVDplayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
