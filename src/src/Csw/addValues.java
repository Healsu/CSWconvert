package src.Csw;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class addValues {

    static ArrayList<ArrayList> collection = new ArrayList<>();
    static int collectionSort = 1;

    public static void addInfo(ArrayList TABLE) {
        try {
            File file = new File("src/src/Csw/text.csw");
            Scanner input = new Scanner(file);
            input.nextLine();


            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] currentLine = line.split(";");
                ArrayList<String> showOnScreen = new ArrayList<>();

                showOnScreen.add(currentLine[0]);
                showOnScreen.add(currentLine[1]);
                showOnScreen.add(currentLine[2]);
                showOnScreen.add(currentLine[3]);
                showOnScreen.add(currentLine[4]);
                showOnScreen.add(currentLine[5]);

                InsertData.PutDataFile(TABLE, showOnScreen);
                collection.add(showOnScreen);
                //System.out.println("TABLE "+collectionSort+showOnScreen);
                collectionSort+=1;


            }


        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }
    }
}
