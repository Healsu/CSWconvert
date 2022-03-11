package src.Csw;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList startTabel = new ArrayList();



    //Dette er vores main hvor vi begynder med at tage den første linje af filen for at kunne beskrive vores TABEL
    public static void main(String[] args) {

        //Vi vil gerne tjekke først om hvis der er filer som dataen kan komme ind på
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

    //Her kommer den første linje af koden ind i et array, som vi bruger senere til at formatere sql ddl
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



