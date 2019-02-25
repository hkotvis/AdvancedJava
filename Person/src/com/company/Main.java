package com.company;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person p[] = new Person[5];
        p[0] = new Person("David", "Davidson", 20);
        p[1] = new Person("Mike", "Wazowski", 30);
        p[2] = new Person("Hailey", "Kotvis", 20);


        for(int i = 0; i < Person.numOfPeople; i++){
            System.out.println(p[i].getFirstName() + " " + p[i].getLastName() + " is " + p[i].getAge() + " years old." ) ;
        }
        Person peep = new Person();
        peep.addWeight(7);
        peep.loseWeight(4);
        System.out.print("\nYour current weight is: ");
        peep.printWeight();


    }
}


//1.Create a “Person” class with 3 instance properties: firstName(a String), lastName(a String) and age (an int).
// In addition to a default constructor, how may additional, overloaded constructors can you think of to create? Create them.
//
// 2.Class properties (declared static) are shared by all object instances created from that class. Can you think of a Person property
// that should be shared? Add that to your Person class. Then write a method that retrieves that data. How should this method be written?
//
// 3.From a separate “Startup” class, create several Person objects and store them in an array. Now write a for-loop to iterate over that
// array and output the full name and age of each of the Person objects stored in that array.

   // Using the Person Class form the previous Activity, create a Weighable Interface.The Interface should define the
// following methods:◦addWeight(double pounds)◦loseWeight(double pounds)Modify the Person Class to implement the Class.




// devfest.gdguwm.com
