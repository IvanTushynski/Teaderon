package data;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpNeeded {
    Experience experience = new Experience();

    public void setNeededExpMain() throws IOException{

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

        for (int i = 1; i < array[experience.loadLevelMain()]; i++) {
            System.out.println(array[experience.loadLevelMain()]);
            File file = new File("src/saves/expNeed");
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.print(array[experience.loadLevelMain()]);
            printWriter.close();
            break;
        }

    }
}