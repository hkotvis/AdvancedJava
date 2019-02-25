package com.company;

public class Person implements Weighable{
    public String firstName;
    public String lastName;
    public int age;
    public static int numOfPeople = 0;
    public double pounds = 120;

    //default constructor
    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        numOfPeople++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumOfPeople() {
        return numOfPeople;
    }

    public static void setNumOfPeople(int numOfPeople) {
        Person.numOfPeople = numOfPeople;
    }

    public void addWeight(double gain){
        pounds = pounds + gain;
    }

    public void loseWeight(double loss){
        pounds = pounds - loss;
    }

    public void printWeight(){
        System.out.println(pounds + " pound(s)");
    }
}
