package Chapter9.bees;

public class Honey{
    public static void main(String []args){
        Honey honeyPot = new Honey();
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};

        Bees bees = new Bees();
        bees.beeHoney = ha;

        Bear[] bears = new Bear[5];
        for(int i=0;i<5;i++){
            bears[i] = new Bear();
            bears[i].honey = honeyPot;
        }

        Kit kit = new Kit();
        Kit.honey = honeyPot;

        Racoon racoon = new Racoon();
        racoon.rh = honeyPot;
        racoon.rk = kit;
        kit = null;
    }
}