package src.Csw;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList startTabel = new ArrayList();

    public static void main(String[] args) {
        InsertData.makeFile();
        try {
            File file = new File("src/src/Csw/text.csw");
            Scanner input = new Scanner(file);


            String line = input.nextLine();
            String[] currentLine = line.split(";");

            startTabel = nyListe(currentLine);
            System.out.println(startTabel);
            addValues.addInfo(startTabel);


        } catch (Exception e) {
            System.out.println("Cant find the file");
        }

    }


    public static ArrayList<String> nyListe(String[] currentLine) {
        String year = currentLine[0];
        String length = currentLine[1];
        String title = currentLine[2];
        String subject = currentLine[3];
        String popularity = currentLine[4];
        String awards = currentLine[5];

        ArrayList<String> result = new ArrayList<>();
        result.add(year);
        result.add(length);
        result.add(title);
        result.add(subject);
        result.add(popularity);
        result.add(awards);

        return result;
    }



    }



