package playwithcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PlayWithCollection {

    public static void main(String[] args) {

        //playWithNames();
        //playWithLists();
        Student s1 = new Student("Nick", 15, 70);

        Student s2 = new Student("Nick", 15, 70);

        Student s3 = new Student("Mary", 18, 85);
        Student s4 = new Student("James", 17, 70);

        Set<String> hashSet = playingWithHashString();
        List<Student> list = playingWithList(s1, s2);
        Set<Student> LinkedHashSet = playingWithLinkedHashSet(hashSet);
        Set<String> treeSet = playingWithSetTree();
        Set<Student> treeSetStudents = playingWithStudentTreeSet(s1, s2, s3, s4);

        TreeSet<Student> myTreeSetComparator = myTreeSetComparator(treeSetStudents);

        Map<String, Integer> map = new HashMap();
        mapsForBegginers(map);
        System.out.println("***Map entry****");
        mapsAndEntry(map);
        mapsAndIterator();
    }

    public static void playWithNames() {

        ArrayList<String> names = new ArrayList();
        names.add("Nick");
        names.add("Jack");
        names.add("Mary");
        names.add("Andy");

        LinkedList<String> linkedListNames = new LinkedList();
        linkedListNames.add("Jack");
        linkedListNames.add("John");
        linkedListNames.addFirst("Mary");

        for (String name : linkedListNames) {

            System.out.println(name + ",");

        }

    }

    public static void playingWithlist() {

        System.out.println("*******printing students in general**********");
        List<Student> generalStudents = Student.getlistOfGeneralStudents();
        Student.printListOfStudents(generalStudents, "\n***printing generalstudents*");
        List<Student> javaStudents = Student.getListOfJavaStudents(generalStudents);
        Student.printListOfStudents(javaStudents, "\n **printing java students****");

        //System.out.println("*******printing students***********8");
//        
//
//        LinkedList<Student> studentsJava = linkedListStudents;
//         studentsJava.add(new Student("Jonathn", 20, 0));
//        System.out.println("******printing students JAVA****");
//       for(Student s:studentsJava){
//        
//            System.out.println(s); }
//        System.out.println("********printing LinkedListStudents*********");
//       for(Student s:linkedListStudents){
//       
//            System.out.println(s); } 
// /*  me to        LinkedList<Student> studentsJava=linkedListStudents;
//         deixnoun kai oi duo metavlites twra to idio antikeimeno gi auto
//         twra poy tin ektipwnw prostheti kai ton jonathan       */
//       List <Student>generalStudents=Student.getlistOfGeneralStudents();
//       Student.printListOfStudents(generalStudents);
//       List<Student> javaStudents=Students.
//       
//       
//        for (Student s : studentsJava1) {
//
//            System.out.println(s);
//        }
//
//        System.out.println("********printing LinkedListStudents*********");
//        for (Student s : linkedListStudents) {
//
//            System.out.println(s);
//        }
    }

    public static Set<String> playingWithHashString() {

        Set<String> hashSet = new HashSet();
        // mporw ston constructor na valw tin lista p thelw
        //wste na m petaei ta doublicates
        //sto set den exoume get(1), mpainoun se tixaia thesi....enw sta array iparxei
        //den dexetai ta diplotima
        // hashSet: metavliti, Set: interface, HashSet:klasi gt mporw na ftiaxw object
        hashSet.add("Nick");
        hashSet.add("Nick");
        hashSet.add("Mary");
        for (String name : hashSet) {
            System.out.println(name);
        }

        return hashSet;

    }

    public static List<Student> playingWithList(Student s1, Student s2) {

        List<Student> list = new ArrayList();
        list.add(s1);
        System.out.println("list.contains(s1):" + list.contains(s1));
        System.out.println("list cointains(s2)" + list.contains(s2));

        return list;

    }

    public static Set<Student> playingWithLinkedHashSet(Set<String> hashSet) {

        //    Set<Student> setOfStudents = new HashSet();
        Set<Student> setOfStudents = new LinkedHashSet();
        // h moni diafora einai o to linkedhashset tha ta ektiponei e ti seira p ta evala

        Student s1 = new Student("Nick", 15, 70);
        System.out.println("s1:" + s1);
        Student s2 = new Student("Nick", 15, 70);
        System.out.println("s2:" + s2);
        Student s3 = new Student("Mary", 18, 85);
        System.out.println("s3:" + s3);
        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1.equals(s2)" + s1.equals(s2));

        setOfStudents.add(s1);
        setOfStudents.add(s2);
        setOfStudents.add(s3);

        for (Student student : setOfStudents) {

            System.out.println(student);
// ΣΤΟ ΣΕΤ ΔΕΝ ΜΠΟΡΩ ΝΑ ΧΡΗΣΙΜΟΠΟΙΗΣΩ ΤΗΝ FOR ΠΑΡΑΔΟΣΙΑΚΟ

        }
        List<String> list2 = new ArrayList(hashSet);
        //petaw se ena hashSet mia lista, gia na m vgazei ta dublicates

        // treeSet: sorts in alphabetic order! and cuts duplicate
        return setOfStudents;

    }

    public static Set<String> playingWithSetTree() {

        // treeSet: sorts in alphabetic order! and cuts duplicate
        Set<String> treeSet = new TreeSet();
        treeSet.add("Nick");
        treeSet.add("Mary");
        treeSet.add("Nick");
        treeSet.add("Jonathan");
        treeSet.add("Andy");
        System.out.println("***Printing TreeSet of names****");
        for (String name : treeSet) {
            System.out.println(name);
        }
        //  List<String> list2 = new ArrayList(hashSet);
        //petaw se ena hashSet mia lista, gia na m vgazei ta dublicates
        return treeSet;

    }

    public static Set<Student> playingWithStudentTreeSet(Student s1, Student s2, Student s3, Student s4) {

        Set<Student> treeSetStudents = new TreeSet();

        treeSetStudents.add(s1);
        treeSetStudents.add(s2);
        treeSetStudents.add(s3);
        treeSetStudents.add(s4);

        System.out.println("****Printing treeSet of students****");

        for (Student s : treeSetStudents) {
            System.out.println(s);

        }
        System.out.println("*****COMPARE***********");

        System.out.println("\n*****PLAYING WITH MAP***********");
        return treeSetStudents;

    }

    public static TreeSet<Student> myTreeSetComparator(Set<Student> treeSetStudents) {

        javaComparatorName myComparator = new javaComparatorName();
        TreeSet<Student> treeSetStudentByName = new TreeSet(myComparator);//dexetai mesa comparator
        treeSetStudentByName.addAll(treeSetStudents);
        for (Student s : treeSetStudentByName) {
            System.out.println(s);
        }

        return treeSetStudentByName;
    }

    public static void mapsForBegginers(Map<String, Integer> map) {
        map.put("Nick", 80);
        map.put("Mary", 60);
        map.put("Jack", 85);
        map.put("Nick", 90);//evale enan nick me timi 90
        map.put("Jack", 90);

        boolean exists = map.containsKey("Mary");
        System.out.println("exists:" + exists);
        map.replace("Mary", 100);
        int grade = map.get("Mary");
        System.out.println("grade=" + grade);

        System.out.println("***PRINTING MAP****");
        Set<String> keysOfMap = map.keySet();
        for (String key : keysOfMap) {
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println("****PRINTING ONLY VALUES*****");
        Collection<Integer> values = map.values();
        for (int value : values) {
            System.out.println(value);
        }

    }

    public static void mapsAndEntry(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //to map einai interface.
        // to Entry einai interface, kai vrisketai mesa stin Map
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        //entry=iterator.next();
        //System.out.println(entry.getKey()+"----->"+entry.getValue());
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "----->" + entry.getValue());

        }

        System.out.println("***********");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

    public static void mapsAndIterator() {

        Set<String> names = new HashSet();
        names.add("Nick");
        names.add("Jack");
        names.add("John");
        for (String name : names) {
            System.out.println(names);

            if (name.equals("Nick")) {
                names.remove(name);
                names.add("Nick Nikolaou");
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                name = it.next();
                if (name.equals("Nick")) {
                    it.remove();

                }

            }

            System.out.println(names);
        }
    }
}
