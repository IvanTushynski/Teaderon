import data.Experience;
import data.MageAttributes;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        //Подгрузка классов-----------------------
        MageAttributes mageAttributes = new MageAttributes();
        Experience experience = new Experience();
        //----------------------------------------

        experience.saveLevelMain();
        System.out.println("Your Level is " + experience.loadLevelMain());
        experience.saveNeededExpMain();
        experience.loadLevelMain();

    }
}
