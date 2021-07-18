package assignment_3.people_package;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private int ID;

    //private Person(int ID, String name, int age) {
        public String getName () {
            return this.name;
        }

        public void setName (String name){
            if (!name.isEmpty()) {
                this.name = name;
            }
        }

        public Integer getAge () {
            return this.age;
        }

        public void setAge ( int age){
            if (age != 0) {
                this.age = age;
            }
        }

        public Integer getID () {
            return this.ID;
        }

        public void setID ( int ID){
            if (ID != 0) {
                this.ID = ID;
            }
        }
   // }
    @Override
    public String toString() {
        System.out.println("Name: " +  name);
        System.out.println("Age: " +  age);
        System.out.println("ID: " +  ID);
        return name + " "+ age + " " + ID ;
    }


}
