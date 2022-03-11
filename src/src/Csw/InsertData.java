package src.Csw;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class InsertData {


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
        try {
            File myObj = new File("ddl.sql");
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

    public static void makeDDL(ArrayList TABLE){
        String filePath = "ddl.sql";

        try
        {

            FileWriter pw = new FileWriter(filePath, true);
            String allmovies = "CREATE TABEL allmovies\n(\n";
            String movies = TABLE.get(0)+" INTEGER";
            String length = TABLE.get(1)+" varchar(200)";
            String title = TABLE.get(2)+" varchar(200)";
            String subject = TABLE.get(3)+" varchar(200)";
            String popularity = TABLE.get(4)+" INTEGER(10)";
            String wonAward = TABLE.get(5)+" BOOLEAN";
            String endLine = "\n);";

            if(pw != null) {
                pw.write(allmovies + movies + "\n" + length + "\n" + title + "\n" + subject + "\n" + popularity + "\n" + wonAward + endLine);
            }else{

            }

            pw.close();
        }
        catch(Exception e)
        {
            System.out.println("error");



    }
    }

    public static void makeDML(ArrayList TABLE, ArrayList info) throws FileNotFoundException {


        String filePath = "dlm.sql";

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
            System.out.println("error");

    }

    }
}