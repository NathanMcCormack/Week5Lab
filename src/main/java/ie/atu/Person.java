package ie.atu;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() { //Constructor
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public Person(String firstName, String lastName, int age) { //Constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
public void getUserInput(){ //user prompt for details
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first name: ");
    this.firstName = scanner.nextLine();

    System.out.println("Enter last name: ");
    this.lastName = scanner.nextLine();

    System.out.println("Enter age: ");
    this.age = scanner.nextInt();
}
    public void displayInfo() {
        System.out.println("Name: " + firstName+ " "+ lastName + ", Age: " + age);
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
}
