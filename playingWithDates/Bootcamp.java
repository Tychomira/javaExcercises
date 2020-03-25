package dateexerciseforhome;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bootcamp {

    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;
    private static List<Bootcamp> bootcampList;

    public Bootcamp(String name, LocalDate startingDate, LocalDate endingDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "Bootcamp{" + "name=" + name + ", startingDate=" + startingDate + ", endingDate=" + endingDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bootcamp other = (Bootcamp) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.startingDate, other.startingDate)) {
            return false;
        }
        if (!Objects.equals(this.endingDate, other.endingDate)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    public static List<Bootcamp> addBootcamp(Bootcamp bootcamp) {

        if (bootcampList == null) //του λεω, αν την πρωτη φορα που βαζω course ειναι null, αρχικοποιησε την! φτιαχνει λιστα μονο οταν χρειαστει.
        {
            bootcampList = new ArrayList();
            bootcampList.add(bootcamp);
        } else {
            bootcampList.add(bootcamp);
        }
        return bootcampList;
    }

    public static void printBootcamps() {

        System.out.println("The bootcamps that are stored are: ");

        if (bootcampList == null) {

            System.out.println("There are no bootcamps yet!");
        } else {

            for (int i = 0; i < bootcampList.size(); i++) {

                System.out.println((i + 1) + "." + bootcampList.get(i));

            }
        }
    }
    
    public  void isThereABootcamp(LocalDate startinDate, LocalDate endingDate, LocalDate enteringDate)
    {
    
    boolean isThereABootcamp = (enteringDate).isAfter(startingDate) && (enteringDate).isBefore(endingDate);

        if (isThereABootcamp) {
            System.out.println(name + ", is available in " + enteringDate + ".It starts in " + startingDate + ", and it ends in " + endingDate);

        }
    
    
    
    
    }
    
    } 

