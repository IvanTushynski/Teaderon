package data;

import data.Experience;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MageAttributes {

    Experience experience = new Experience();
    private final String nameMage = "Mage";

    private final float healthMage = 19 + experience.loadLevelMain();
    private final float manaMage = 30 + experience.loadLevelMain() * 4;
    private final float defenseMage = 2 * experience.loadLevelMain();
    private final float attackMage = 2 + experience.loadLevelMain();
    private final float criticalMage = attackMage / 2;
    private float skillMage;

    public MageAttributes() throws FileNotFoundException {
    }

    public void saveHealth() throws FileNotFoundException {

        File file = new File("src/saves/health");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print(healthMage);
        printWriter.close();
    }

}
