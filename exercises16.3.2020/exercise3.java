/*3. What season is according to month. Enter month from terminal.*/



public class exercise3{

public static void main(String [] args){

String month=new String (args[0]);
System.out.println("The month you entered is : "+month);

switch(month){

case "january":
System.out.print("\nThe season is Winter!");
break;

case"february":
System.out.print("\nThe season is Winter!");
break;

case "march":
System.out.print("\nThe season is Spring!");
break;

case "april" :
System.out.print("\nThe season is Spring!");
break;

case"may":
System.out.print("\nThe season is Spring!");
break;

case"june":
System.out.print("\nThe season is Summer!");
break;

case"july":
System.out.print("\nThe season is Summer!");
break;

case"august":
System.out.print("\nThe season is Summer!");
break;

case"september":
System.out.print("\nThe season is Fall!");
break;

case"october":
System.out.print("\nThe season is Fall!");
break;

case"november":
System.out.print("\nThe season is Fall!");
break;

case"december":
System.out.print("\nThe season is Winter!");
break;

default:
System.out.print("\nIncorrect entry please enter one month");

}



}
}