package Chapter2.drumkit;

/*op:
* bang bang ba-bang
* ding ding da-ding*/


public class DrumKitTestDrive {
    public static void main(String[] args) {
//object to play
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if(d.snare == true){
            d.playSnare();
        }
    }
}