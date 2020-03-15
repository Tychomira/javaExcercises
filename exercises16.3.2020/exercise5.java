/*Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest). */

public class exercise5{

public static void main (String [] args){

char grade = args[0].charAt(0);

switch(grade){

case 'A':
System.out.println("You did Perfect!!!");
break;

case'B':
System.out.println("You did Good");
break;

case'C':
System.out.println("You passed");
break;

case'D':
System.out.println("You failed");
break;

default:
System.out.println("The grade you entered is invalid, please enter between A,B,C,D");




}

















}
}