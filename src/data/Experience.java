package data;

import java.io.*;
import java.util.ArrayList;
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

    public void saveNeededExpMain() throws IOException {

        ArrayList<Integer> numbers = null;
        try (Scanner scanner = new Scanner(new File("src/saves/levelsMain"))) {
            numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Integer[] array = numbers.toArray(new Integer[0]);

        for (int i = 1; i < array[loadLevelMain()]; i++) {
            System.out.println(array[loadLevelMain()]);
            File file = new File("src/saves/expNeed");
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.print(array[loadLevelMain()]);
            printWriter.close();
            break;
        }

    }

}
