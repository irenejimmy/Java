package irene;

import java.util.Scanner;

public class basics7 {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        basics7 student1 = new basics7();

        
        System.out.print("Enter name: ");
        student1.name = scanner.nextLine();

        System.out.print("Enter age: ");
        student1.age = scanner.nextInt();

        
        student1.displayDetails();

        scanner.close();
    }
}
