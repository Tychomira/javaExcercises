/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryouts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ticho
 */
public class luckyNumbersExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = myName();
        char yourGender = getGender(name); // καλω την μεθοδο που θελω εχοντας βαλει και την μεταβλητη που θελω να παρω.
        int age = yourAge(name);
        favouriteSeason(name);
        yourBmi(name);
        int luckyNumber = luckyNumber(age, name);
        canYouGetIn(age, name, yourGender, luckyNumber);

    }

    static char getGender(String name) {
        Scanner input = new Scanner(System.in);

        System.out.println(name + ", what is your gender? ");
        System.out.println("Please answer either entering 'f' for female, of 'm' for male");

        //input.next().charAt(0);    για να δεχεται ακριβως εναν χαρακτηρα!
        char gender = input.next().charAt(0);
        while ((gender != 'F') && (gender != 'f') && (gender != 'm') && (gender != 'M')) {
            System.out.println("You have entered an invalid answer");
            System.out.println("Please enter either 'f'for female or 'm' for male");
            gender = input.next().charAt(0);

        }

        return gender;

    }

    static int yourAge(String name) {

        Scanner input = new Scanner(System.in);
        System.out.println(name + ", what is your age? ");
        int myAge = input.nextInt();

        boolean myAge1 = 0 < myAge && myAge <= 5;
        boolean myAge2 = 6 <= myAge && myAge <= 18;
        boolean myAge3 = 19 <= myAge && myAge <= 40;

        if (myAge == 0) {
            System.out.println("This is not possible, you are joking please enter your age again:");
            myAge = input.nextInt();

        } else if (myAge1 == true) {
            System.out.println("You are too young for this app.");
            int comeBack1 = 6 - myAge;
            System.out.println("Come back in " + comeBack1 + ", when you will be a student!");
        } else if (myAge2 == true) {
            System.out.println("Oh you are a student.");
            int comeBack2 = 19 - myAge;
            System.out.println("Keep up... " + comeBack2 + " more years left and afterwards you will make money.");
        } else if (myAge3 == true) {
            System.out.println("Well, you must be employed.");
            int comeBack3 = myAge - 18;
            System.out.println("You finshed school " + comeBack3 + " years ago.");
        }

        int dateOfBirth = (2020 - myAge);
        int age1980 = (1980 - dateOfBirth);
        int age2040 = (2040 - dateOfBirth);

        if (age1980 < 0) {
            System.out.println("You must be kiding,in 1985 you weren't born yet, but in 2040 you will be: " + age2040);

        } else {
            System.out.println(name + ", in 1980 you were: " + age1980 + " years old,and in 2040 you will be: " + age2040);
        }

        return myAge;
    }

    static String myName() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your name:");
        String name = input.next();

        return name;

    }

    static void favouriteSeason(String name) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> seasonFav = new ArrayList();
        seasonFav.add("Winter");
        seasonFav.add("Spring");
        seasonFav.add("Summer");
        seasonFav.add("Autumn");

        System.out.println(name + ", choose your favourite season, by typing the relavant number: ");

        for (int i = 1; i <= seasonFav.size(); i++) {

            System.out.println(i + "." + seasonFav.get(i - 1));

        }

        System.out.print(name + ", your answer is: ");
        int favSeas = input.nextInt();

        if (favSeas > 4 || favSeas < 1) {
            System.out.println(name + ", invalid entry, you must enter either 1 or 2 or 3 or 4. Please enter your choice again :");
            input.nextInt();
        }

        /*if (!input.hasNextInt()) {
                System.out.println(name + ", invalid entry, you must enter either 1 or 2 or 3 or 4. Please enter your choice again :");
                favSeas = input.nextInt();

            }
         */
        if (favSeas == 1) {
            System.out.println(name + ", it must be cold outside");
        } else if (favSeas == 2) {

            System.out.println(name + ",ohh, flowers are very beautiful these days ");
        } else if (favSeas == 3) {
            System.out.println(name + ", let's go for swimming");
        } else if (favSeas == 4) {
            System.out.println(name + ",the trees are full of brown leaves ");
        }

    }

    static void yourBmi(String name) {

        Scanner input = new Scanner(System.in);
        System.out.println(name + ", please enter your height in metres: ");

        /*  boolean checkHeight = input.hasNextInt();

        if (checkHeight = true) {

            System.out.println(name + ", please enter your height again in this form 1,65: ");
            input.nextDouble();

        }
         */
        double yourHeight = input.nextDouble();

        System.out.println(name + ", now please enter yout weight in kilos: ");
        /* boolean checkWeight = input.hasNextDouble();
        if (checkWeight = true) {

            System.out.println(name + ", please enter your weight in this form 65 : ");
            input.nextInt();
        }*/
        int yourWeight = input.nextInt();

        double bMi = yourWeight / (yourHeight * yourHeight);

        if (bMi <= 18.5) {
            System.out.println(name + ", you are underweighted!");
        } else if (bMi > 18.5 && bMi < 24.9) {
            System.out.println(name + ", you have a normal weight");
        } else if (bMi > 25 && bMi <= 29.9) {
            System.out.println(name + ", you are overweighted!");
        } else {
            System.out.println("Obesity!");

        }

    }

    static int luckyNumber(int age, String name) {

        int luckyDay;

        for (luckyDay = 0; age > 0; luckyDay += age % 10, age /= 10);
        {
            if (luckyDay > 6) {
                luckyDay = luckyDay % 7;
            }
            if (luckyDay == 0) {
                System.out.println(name + ", your lucky day is Monday");
            }
            if (luckyDay == 1) {
                System.out.println(name + ",your lucky day is Tuesday ");
            }
            if (luckyDay == 2) {
                System.out.println(name + ", your lucky day is Wensday");
            }
            if (luckyDay == 3) {
                System.out.println(name + ", your lucky day is Tuesday");
            }
            if (luckyDay == 4) {
                System.out.println(name + ",your lucky day is Friday");
            }
            if (luckyDay == 5) {
                System.out.println(name + ", your lucky day is Saturday");
            }
            if (luckyDay == 6) {
                System.out.println(name + ", your lucky day is Sunday");
            }

            return luckyDay;

        }
    }

    static void canYouGetIn(int age, String name, char yourGender, int luckyNumber) {

        Scanner input = new Scanner(System.in);

        while (luckyNumber == 2 && age >= 20 && age <= 40) {

            if (age >= 20 && age <= 25) {
                System.out.println(name + ",welcome to our club!!!");
            }

            if ((age > 25) && (yourGender == 'm') || (yourGender == 'M')) {
                System.out.println("Mr " + name + ", welcome to our club");
            }
            if ((age > 25) && (yourGender == 'f') || (yourGender == 'F')) {
                System.out.println("Hello, are you married? Please answer with yes or no: ");

                String youMarried = input.next();

                if ("yes".equals(youMarried)) {

                    System.out.println("Ms " + name + ", welcome to our club");

                } else if ("no".equals(youMarried)) {
                    System.out.println("Mrs " + name + ", welcome to oure club");
                }

                break;
            }
            }
            while (luckyNumber != 2 && age >= 20 && age <= 40) {
                System.out.println(name + ", i am sorry you cannot enter");
                break;
            }

        }
    }
