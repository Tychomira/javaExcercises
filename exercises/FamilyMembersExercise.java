/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familymembersexercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ticho
 */
public class FamilyMembersExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner(System.in);
        File file = new File("C:\\Users\\ticho\\Documents\\JavaExample\\FamilyMembersExercise.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.print("NAME");
         writer.print("\tAGE");
         writer.print("\tWEIGHT(kg)");
         writer.print("\tHEIGHT(m)");
       do{
         
        String formatName = String.format("%s", nameFamilyMember());
        String formatAge = String.format("%d", ageFamilyMember(formatName));
        String formatWeight = String.format("%d", weightFamilyMember(formatName));
        String formatHeight = String.format("%f", heightFamilyMember(formatName));
       
        writer.print("\n"+formatName);
        writer.print("\t"+formatAge);
        writer.print("\t"+formatWeight);        
        writer.print("\t"+formatHeight);
        System.out.println("Person was created successfully!!!");
           System.out.println(" ");
       
       String   checkWord=input.nextLine();
    if (input.equals("exit")) {
        System.out.println("The program has endided!");
    writer.close();}
    else{
        continue;
      } while(input.hasNextLine());
       
           
        
              
        printTextFromFile("file");
        
        
        
        
    }

    public static String nameFamilyMember() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I would like some information about your family!!");
        // System.out.println("Please enter the name of the family member: ");
        String name;

        System.out.println("Please enter the name of the family member: ");
        while (input.hasNextInt()) {
            System.out.println("Please enter a name: ");
            input.next();
        }
        name = input.next();
        return name;

    }

    public static int ageFamilyMember(String name) {

        Scanner input = new Scanner(System.in);

        int age;
        do {
            System.out.println("Please enter the age of " + name + ":");
            while (!input.hasNextInt()) {
                System.out.println("please enter a number");
                input.next();
            }
            age = input.nextInt();

        } while (age < 0 || age >= 100);
        return age;

    }

    public static int weightFamilyMember(String name) {
        Scanner input = new Scanner(System.in);

        int weight;
        do {
            System.out.println("What is the weight of " + name + " :");
            while (!input.hasNextInt()) {
                System.out.println("please enter the weight in kilos : ");
                input.next();
            }
            weight = input.nextInt();

        } while (weight < 0 || weight >= 300);

        return weight;

    }

    public static double heightFamilyMember(String name) {
        Scanner input = new Scanner(System.in);

        double height;
        do {
            System.out.println("Please enter the height of " + name + ":");
            while (!input.hasNextDouble()) {
                System.out.println("please enter height in meters:");
                input.next();
            }
            height = input.nextDouble();

        } while (height < 0 || height >= 2.6);

        return height;

    }

    
    public static void printTextFromFile(String file) throws FileNotFoundException, IOException{
    
     FileReader fileReader = new FileReader(file);   
        BufferedReader reader = new BufferedReader(fileReader);  
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
        fileReader.close();
    
    
    
    
    }
    
    
}
