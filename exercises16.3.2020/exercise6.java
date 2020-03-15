/*  6. Based on age what can you do?
lt 16>>You cannot drive
16-17>>You can drive but not vote
18-21>>You can vote but not drink
gt 22>>You can do anything   */


public class exercise6{
public static void main (String[]args){

int age = Integer.parseInt(args[0]);

if(age<=0){
System.out.println("You must be joking, please enter your real age");
}

if (age>0){

if (age>1 && age<16){
System.out.println("You cannot drive!");
}
else if (age<=17){
System.out.println("You can drive but not vote");
}
else if (age>=18 && age<=21){
System.out.println("You can vote but not drink");
}
else if (age>=22){

System.out.println("You can do anything!");
}

}





}
}