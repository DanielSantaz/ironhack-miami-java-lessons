package com.ironhack.w1.wednesday;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// SCANNER MOMENT
public class Main {
    public static void main(String[] args) throws IOException {
//
//
//
//
//        // SCANNER CLASS
//
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        do {
//            System.out.println("Please write your name");
//
//            name = scanner.nextLine();
//        } while (name.isEmpty());
//
//        name = name.substring(0,1).toUpperCase() + name.substring(1);
//
//        System.out.println("your name is " + name);
//
//
//
//
//
//        do {
//            scanner = new Scanner(System.in);
//            System.out.println("Please write your age!");
//
//        } while (!scanner.hasNextInt());
//        int age = scanner.nextInt();
//        System.out.println("your age is " + age);
//
//
//
//
//        scanner.close();

//        FILE HANDLING:


        String filePath = "src/com/ironhack/w1/wednesday/file.txt";

        File file = new File(filePath);
        if (file.createNewFile()){
            System.out.println("FILE HAS BEEN CREATED");
        } else {
            System.out.println("FILE ALREADY EXISTS");
        }

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("This is a line\n");
        fileWriter.close();

        Scanner fileScanner = new Scanner(file);

        String str = "";



        while(fileScanner.hasNextLine()){

            str += fileScanner.nextLine() + "\n";
        }

        System.out.println(str);
        fileScanner.close();

    }




}
