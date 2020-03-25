package dateexerciseforhome;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please create three bootcamps! ");
        List<Bootcamp> bootcampList = new ArrayList();
        Bootcamp bootcamp;
        LocalDate startingDate;
        LocalDate endingDate;

        for (int i = 0; i < 3; i++) {

            String name = nameBootcamp();
            startingDate = start_date();
            endingDate = end_date();
            bootcamp = new Bootcamp(name, startingDate, endingDate);
            Bootcamp.addBootcamp(bootcamp);

        }
        
        
        
        System.out.println("Now Please enter a date:");
        LocalDate enteringDate = enteringDate();

        boolean isThereABootcamp = (enteringDate).isAfter(startingDate) && (enteringDate).isBefore(endingDate);

        if (isThereABootcamp) {
            System.out.println(name + ", is available in " + enteringDate + ".It starts in " + startingDate + ", and it ends in " + endingDate);

        }

    }

    public static String nameBootcamp() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat is the name of the bootcamp ?");
        String name;
        while (input.hasNextInt()) {
            input.next();
            System.out.println("invalid entry!!!!!");
            System.out.println("please entry name!!");

        }
        name = input.next();

        return name;

    }

    public static LocalDate start_date() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWhen does the course start? Your entry must be in this form:dd/MM/yyyy");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String start_date;

        do {
            start_date = input.nextLine();

            try {
                return LocalDate.parse(start_date, formatter);
            } catch (Exception e) {
                System.err.println("Invalid date value:: " + start_date);
                System.out.println("Please enter the date in this type: dd/MM/yyyy");
            }

        } while (input.hasNextLine());

        return LocalDate.parse(start_date, formatter);
    }

    public static LocalDate end_date() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWhen does the course end? Your entry must be in this form:dd/MM/yyyy");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String end_date;

        do {
            end_date = input.nextLine();

            try {
                return LocalDate.parse(end_date, formatter);
            } catch (Exception e) {
                System.err.println("Invalid date value:: " + end_date);
                System.out.println("Please enter the date in this type: dd/MM/yyyy");
            }

        } while (input.hasNextLine());

        return LocalDate.parse(end_date, formatter);

    }

    public static LocalDate enteringDate() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nNow please enter a date! Your entry must be in this form:dd/MM/yyyy");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String enteringDate;

        do {
            enteringDate = input.nextLine();

            try {
                return LocalDate.parse(enteringDate, formatter);
            } catch (Exception e) {
                System.err.println("Invalid date value:: " + enteringDate);
                System.out.println("Please enter the date in this type: dd/MM/yyyy");
            }

        } while (input.hasNextLine());

        return LocalDate.parse(enteringDate, formatter);

    }

}
