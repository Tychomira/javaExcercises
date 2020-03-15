
/*1. What class in school are you going according to age;
   Use an if-else-if.
   For example: 5-12 dimotiko, ...
   Can you use a switch statement?*/



public class exercise1{

public static void main (String [] args){


int age=Integer.parseInt(args[0]);
System.out.print("your age is: "+age);
if(age<=0)
{
System.out.println("\nYou must be joking!!!!please enter again your age: ");
//age=Integer.parseInt(args[0]);
}

if(age>0)
{
if(age<=5){
System.out.print("\nyou are in kindergarden!!");
}
else if(age <=12)
{
System.out.print("\nyou are in Dimotiko!! ");
}
else if (age <=15){
System.out.print("\nyou are in Gumnasio !!");
}
else if (age <=18){
System.out.print("\nyou are in Lukeio !!");
}
else if (age<=22){
System.out.println("\nyou are in Panepistimeio!!");
}
else{
System.out.print("\nyou have graduated school.");
}
}


}


}
/*Στην μορφή που είναι γραμμένος τώρα ο κώδικας μου δεν μπορώ να χρησιμοποιήσω switch statement, διότι δεν
λειτουργεί με συνθήκες.Αν είχα γράψει αναλυτικά όμως πχ: αν εισαι 6=1η δημοτικού, 7=2α δημοτικού κλπ, τότε 
θα μπορούσα να τη χρησιμοποιήσω! */