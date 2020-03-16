/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txturls;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ticho
 */
public class TxtUrls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         File file = new File("C:\\Users\\ticho\\Documents\\JavaExample\\urlForExercise.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.print("https://www.javatpoint.com/ \n");
        writer.print("https://docs.oracle.com/javase/8/docs/\n");
        writer.print("https://www.baeldung.com/\n");
        writer.print("https://www.vogella.com//tutorials/java.html\n");
        writer.print("https://www.tutorialspoint.com/java_technology_tutorials.htm\n");
   
     writer.close();
    
    
    printText("file");
    printJava("file");
    
    }
    
    
    public static void printText (String file) throws FileNotFoundException, IOException
    {
        
        FileReader fileReader = new FileReader(file);   // tis dinoyme to onoma tou arxeio...//pataw tin lampa prwti epilogi.
        BufferedReader reader = new BufferedReader(fileReader);  //gia na doulepsei thelei reader mia klasi dld einai h FileReader
        String line = reader.readLine();
         while (line != null) {
            System.out.println(line.substring(13, 23));
            line = reader.readLine();

        }

        reader.close();
        fileReader.close();
        
        
    }
    public static void printJava (String file) throws FileNotFoundException, IOException{
    
     FileReader fileReader = new FileReader(file);   // tis dinoyme to onoma tou arxeio...//pataw tin lampa prwti epilogi.
        BufferedReader reader = new BufferedReader(fileReader);  //gia na doulepsei thelei reader mia klasi dld einai h FileReader
        String line = reader.readLine();
         while (line != null) {
            System.out.println(line.contains("java"));
            line = reader.readLine();

        }

        reader.close();
        fileReader.close();
    
    
    
    }
    
}
