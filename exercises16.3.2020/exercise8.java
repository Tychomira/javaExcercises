/*8. Use ternary to return a message child or adult. Older than 18 is adult.*/

public class exercise8{
public static void main(String[]args){




int age=Integer.parseInt(args[0]);

String message=(age<18)?"You are a kid":"You are an adult";
System.out.println(message);




}
}