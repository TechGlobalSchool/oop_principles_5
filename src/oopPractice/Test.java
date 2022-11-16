package oopPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line:\n");
        Sword sword1 = new Sword("Iron"); // -> default constructor
        System.out.println("Printing out the sword1 = " + sword1);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword", "iron"); // -> Modified constructor
        System.out.println("Printing out the sword2 = " + sword2);

    }
}
