/*4. Print the number of days each month has. Use switch.*/

public class exercise4{
public static void main(String[]args){

String month=new String(args[0]);

switch(month){



case"january":
System.out.println(month+", has 31 days!");
break;

case"february":
System.out.println(month+", has 28 days.But every 4 years it has 29 days!");
break;

case"march":
System.out.println(month+", has 31 days!");
break;

case"april":
System.out.println(month+", has 30 days!");
break;

case"may":
System.out.println(month+", has 31 days!");
break;

case"june":
System.out.println(month+", has 30 days!");
break;

case"july":
System.out.println(month+", has 31 days!");
break;


case"august":
System.out.println(month+", has 31 days!");
break;

case"september":
System.out.println(month+", has 30 days!");
break;

case"october":
System.out.println(month+", has 31 days!");
break;

case"november":
System.out.println(month+", has 30 days! ");
break;

case"december":
System.out.println(month+", has 31 days! ");
break;

default:
System.out.println("Invalid entry!Please enter one month.");
}






}
}

 