package FileManagement;

import java.io.*;

import java.io.IOException; // Import the IOException class to handle errors
import java.net.InetSocketAddress;
import java.util.Scanner;

import static java.lang.Character.getName;

public class Main {
    public static void main(String[] args) {

        File Obj = new File("C:\\Users\\dell\\JavaProgramme\\PrepaControl\\Init\\src\\FileManagement\\source.txt");
        File Objs = new File("C:\\Users\\dell\\JavaProgramme\\PrepaControl\\Init\\src\\FileManagement\\destination.txt");
        try {
            if (Obj.createNewFile() && Objs.createNewFile()) {
                System.out.println("File destination created: " + Obj.getName());
                System.out.println("File source created: " + Objs.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {

            System.out.println("erreur.");
            e.printStackTrace();
        }


        //clonage


        try {
            Scanner reader=new Scanner(Obj);

            while(reader.hasNextLine()){

                String Data =reader.nextLine();

                // ecriture dans source

                try {
                    FileWriter Writer = new FileWriter(Objs);
                    Writer.write(Data);
                    Writer.close();
                    System.out.println("written avec succes");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

