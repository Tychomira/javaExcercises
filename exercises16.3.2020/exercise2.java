/*2. What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing */

public  class exercise2 {
public static void main(String[] args){

String day= new String(args[0]); 
System.out.println("The day you entered is : "+day);
switch(day){

case "monday":
System.out.print("\nGo to work!");
break;


case "tuesday":
System.out.print("\nGo to work!");
break;

case "wednesday":
System.out.print("\nGo to work!");
break;

case "thursday":
System.out.print("\nGo to work!");
break;

case "friday":
System.out.print("\nGo to work!");
break;

case "saturday":
System.out.print("\nRelaxing!");
break;

case "sunday":
System.out.print("\nRelaxing!");
break;

default:
System.out.print("\n invalid input, please enter from monday-sunday!!!!");
}


}
}

 

