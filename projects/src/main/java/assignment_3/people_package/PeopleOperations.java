package assignment_3.people_package;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PeopleOperations {

    public static void main(String args[]) throws Exception {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */

        ArrayList<String> names = new ArrayList<>();//create an Arraylist name
        names.add("Marq");
        names.add("Bill");
        names.add("Bob");
        names.add("Tom");
        names.add("Jill");

        int limit = 10; //this is the upper limit of the arraylist and maximum of ID
        int counter = 0; //initial count
        int low = 1; //lowest age or ID
        int max = 99; //maximum age


        ArrayList<Person> people = new ArrayList<Person>(); //Create an instance of person object named people
        System.out.println("The unsorted list: ");
        //create 10 rows of name, age, ID; all are randomly generated.
        while (counter < limit) {

            int index = ThreadLocalRandom.current().nextInt(0, names.size());
            String name = names.get(index) + Integer.valueOf(counter); //value of the counter is added to name to create a unique name

            int age = ThreadLocalRandom.current().nextInt(low, max + 1); //random age between 1 to 99 is generated

            int ID = ThreadLocalRandom.current().nextInt(low, limit + 1); // random Id between 1 to 10 is generated


            Person p = new Person(); //Person object p is created to enable setting of the name, age, ID variables from person.java
            p.setName(name);
            p.setAge(age);
            p.setID(ID);


            people.add(p); //rows are added to the arraylist people
            System.out.println(p);
            counter++;


        } //end of while loop


        Person youngestPerson = getYoungestPerson(people); //this is a method to find the youngest person in the people arraylist

        Person oldestPerson = getOldestPerson(people); //this is a method to find the oldest person in the people arraylist

        ArrayList<Person> sortedByAgeList = getSortedListByAge(people, true); //this is a method to sort people arraylist by age
        System.out.println("List sorted by age: "); //to print the list sorted by age
        for (Person p : sortedByAgeList) { //for each loop
            System.out.println(p);
        }

        //average age
        int sum = 0;
        double avg = 0;

        for(int i = 0; i< people.size(); i++) {
            sum = sum + people.get(i).getAge();
        }
        avg = sum/people.size();
        System.out.println("Average age of persons: " + avg);

        ArrayList<Person> sortedByNameList = getSortedListByName(people, false); //this is a method to sort people arraylist by name
        System.out.println("List sorted by name: "); //to print the list sorted by name
        for (Person p : sortedByNameList) {
            System.out.println(p);

        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */


        }
    }


    public static Person getYoungestPerson(ArrayList<Person> list) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Please implement this method");//throw exception if the list is empty
        } else {
            getSortedListByAge(list,true); //call the method that has sorted the arraylist by age
            System.out.println("Name of the youngest person: " + list.get(0).getName()); //print the name in the first index
            return list.get(0);
        }

    }


    public static Person getOldestPerson(ArrayList<Person> list) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Please implement this method");//throw exception if the list is empty
        } else {
            getSortedListByAge(list,true);
            System.out.println("Name of the oldest person: " + list.get(list.size() - 1).getName()); //print the name in the last index
            return list.get(list.size() - 1);

        }

    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list, boolean isAscending) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Please implement this method");//throw exception if the list is empty
        } else if(isAscending==true) {

            for (int j = 0; j < list.size() - 1; j++) { //sort logic to swap places depending on greater of the two ages
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).getAge() > list.get(i + 1).getAge()) {
                        Person temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set((i + 1), temp);
                    }
                }

            }


        }

        else if(isAscending==false) {

            for (int j = 0; j < list.size() - 1; j++) { //sort logic to swap places depending on greater of the two ages
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).getAge() < list.get(i + 1).getAge()) {
                        Person temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set((i + 1), temp);
                    }
                }

            }

        }
        return list;
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Please implement this method");//throw exception if the list is empty
        } else if (isAscending == true) {
            for (int j = 0; j < list.size() - 1; j++) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).getName().compareTo(list.get(i + 1).getName()) > 0) {
                        Person temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set((i + 1), temp);
                    }
                }

            }
            return list;
        }
        else if (isAscending == false) {
            for (int j = 0; j < list.size() - 1; j++) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).getName().compareTo(list.get(i + 1).getName()) > 0) {
                        Person temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set((i + 1), temp);
                    }
                }

            }
        }
        return list;


    }

}



