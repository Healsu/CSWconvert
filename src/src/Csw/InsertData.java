package src.Csw;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class InsertData {

    BufferedReader rand = null;
    public static void makeFile(){
        try {
            File myObj = new File("dlm.sql");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void PutDataFile(ArrayList TABLE, ArrayList info) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String filePath = "dlm.sql";
        BufferedReader br = new BufferedReader(new FileReader("dlm.sql"));

        try
        {

            FileWriter fw = new FileWriter(filePath, true);
            String tableLine = "INSERT INTO ("+TABLE.get(0)+","+TABLE.get(1)+","+TABLE.get(2)+","+TABLE.get(3)+","+TABLE.get(4)+","+TABLE.get(5)+")";
            String valueLine = "VALUES ("+info.get(0)+","+info.get(1)+","+info.get(2)+","+info.get(3)+","+info.get(4)+","+info.get(5)+")\n";
            if(fw !=null) {
                fw.write(tableLine+" "+valueLine);
            }else {


            }
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);

    }

    }
}