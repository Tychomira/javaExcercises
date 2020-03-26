package namesArrayRecap;

import java.util.ArrayList;

public class RecapExercises {

    public static void main(String[] args) {
        
        ArrayList<String> names=new ArrayList();
        
        names.add("Nikolas");
        names.add("Anna");
        names.add("Anastasia");
        names.add("George");
        names.add("Sofia");
        names.add("Andrew");
        names.add("Andrew");
        names.add("Mary");
        names.add("John");
        
        NamesFirstLet(names, 'A');
        
        
        
    }

    
     public static void NamesFirstLet(ArrayList<String> array1, char letter){
        System.out.println("Printing names that don't start with:"+letter);
        for(String name:array1)
        {
        if(name.charAt(0)!=letter)
        {
            System.out.println(name);
        
        }
        }
   
   
    
    }
    
    
}
