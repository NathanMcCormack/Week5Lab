package ie.atu;

public class Main {
    public static void main(String[] args) {
    //creates a new person object
        Person student1 = new Person("Nathan","McCormack",19);
        Person user = new Person();

        //Call the display method
        student1.displayInfo();

        user.getUserInput();
        user.displayInfo();
    }
}