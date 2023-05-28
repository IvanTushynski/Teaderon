import data.ExpNeeded;
import data.Experience;
import data.MageAttributes;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        //Подгрузка классов-----------------------
        MageAttributes mageAttributes = new MageAttributes();
        Experience experience = new Experience();
        ExpNeeded expAmount = new ExpNeeded();
        //----------------------------------------

        experience.saveLevelMain();
        System.out.println("Your Level is " + experience.loadLevelMain());
        expAmount.setNeededExpMain();
        experience.loadLevelMain();
        mageAttributes.saveHealth();

    }
}
