package codingdojo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("What kind of pet do you have?");
        var petString = scanner.nextLine();

        Pet myPet = new Pet();
        if (petString.toLowerCase().contains("cat")) {
            myPet = new Cat();
        } else if (petString.toLowerCase().contains("dog")) {
            myPet = new Dog();
        } else if (petString.toLowerCase().contains("laptop")
                || petString.toLowerCase().contains("computer")) {
            myPet = new Laptop();
        }
        System.out.println("Your pet's greeting: " + myPet.greetMe());
    }
}
