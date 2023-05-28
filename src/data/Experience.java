package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Experience {

    private int levelMain = 2;

    private int expNeedMain;
    private int expAmountMain;

    private int expNeedCraft;
    private int expAmountCraft;

    private int expNeedMining;
    private int expAmountMining;


    public void saveLevelMain() throws FileNotFoundException {

        File file = new File("src/saves/levelMain");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print(levelMain);
        printWriter.close();
    }

    public int loadLevelMain() throws FileNotFoundException {

        FileReader fileReader = new FileReader("src/saves/levelMain");
        Scanner scannerLoad = new Scanner(fileReader);

        int level = scannerLoad.nextInt();
        levelMain = level;
        scannerLoad.close();
        return level;
    }

}
