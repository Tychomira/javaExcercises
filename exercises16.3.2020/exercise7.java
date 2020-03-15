/*  7. Program should ask your weight and planet. Compute your weight on the planet based on the table below:
#    Planet    Relative gravity
1    Venus        0.78
2    Mars        0.39
3    Jupiter    2.65
4    Saturn    1.17
5    Uranus    1.05
6    Neptune    1.23
So, for example, if your weight is 80 kg on earth, then you would weigh just over 31 kg on Mars, since Mars' gravity is 0.39 times earth's gravity. (80 * 0.39 is 31.20)  */



public class exercise7{
public static void main (String [] args){

/*String[] planetNames={"Venus", "Mars","Jupiter","Saturn","Uranus","Neptune"};
for(int i =0; i<=planetNames.length
; i++)
System.out.println("The list with the planets for you to choose is: " +i+planetNames[i-1]);


*/

int weight=Integer.parseInt(args[0]);

double newWeight;

String planet=new String(args[1]);

switch(planet){

case "Venus":
newWeight=0.78*weight;
System.out.println("Your weight in "+planet+" is = "+newWeight);
break;

case"Mars":
newWeight=0.39*weight;
System.out.println("Your weight in "+planet+" is = "+newWeight);
break;

case"Jupiter":
newWeight=2.65*weight;
System.out.println("Your weight in "+planet+" is = "+newWeight);
break;

case"Saturn":
newWeight=1.17*weight;
System.out.println("Your weight in "+planet+" is = "+newWeight);
break;

case "Uranus":
newWeight=1.05*weight;
System.out.println("Your weight in "+planet+" is = "+newWeight);
break;

case"Nepture":
newWeight=1.23*weight;
System.out.println("Your weight in "+planet+" is = "+newWeight);
break;

default:
System.out.println("Invalid entry.Please try again. First your kilos and then the name of the planet.!");





















}


}
}