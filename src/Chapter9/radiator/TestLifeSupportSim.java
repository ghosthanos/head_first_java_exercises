package Chapter9.radiator;

import java.util.ArrayList;

class SimUnit{
    String botType;

    //constructor
    SimUnit(String type){
        botType = type;
    }

    int powerUse(){
        if("Retention".equals(botType)){
            return 2;
        }
        else{
            return 4;
        }
    }
}






public  class TestLifeSupportSim{
    public static void main(String []args) {

        ArrayList<SimUnit> aList = new ArrayList<SimUnit>();

        V2Radiator v2 =new V2Radiator(aList);
        V3Radiator v3 =new V3Radiator(aList);

        for(int z=0; z<20; z++)
        {
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}