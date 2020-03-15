/* 9. Create a program that stores the names of your 4 best friends in an array. 
Then print these names from the array. Use for-traditional, for enhanced, while, do-while. */



import java.util.Arrays;
public class exercise9{



public static void main(String[]args){


String [] myBestFriends={"Mary", "Dora","Irene","Popi"};


System.out.println("*****FOR TRADITIONAL********");

for(int i=0; i<myBestFriends.length; i++)
{
System.out.println(myBestFriends[i]);

}

System.out.println("******FOR ENHANCED********");

for(String names:myBestFriends){
System.out.println(names);
}

System.out.println("******WHILE******");

int i =0;
while(i<myBestFriends.length)
{

System.out.println(myBestFriends[i]);
i++ ;
}

System.out.println("******DO-WHILE******");

int j =0;
do{

System.out.println(myBestFriends[j]);
j++;
}

while(j<myBestFriends.length);



}
}