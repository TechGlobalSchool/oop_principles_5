package oopPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line:\n");
        Sword sword1 = new Sword("Iron"); // -> default constructor
        System.out.println("Printing out the sword1 = " + sword1);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword", "iron"); // -> Modified constructor
        System.out.println("Printing out the sword2 = " + sword2);

        System.out.println("\nSword3 is created after this line:\n");
        Sword sword3 = new Sword(10, 25.0, "super long sword", "titanium"); // -> Modified constructor
        System.out.println("Printing out the sword3 = " + sword3);

        System.out.println("\nWorking with static values\n");

        System.out.println("hasHandle = " + Sword.hasHandle);
        System.out.println("isSharp before = " + Sword.isSharp); // default value = false
        Sword.damage();
        // final values can't be changed
//        Sword.hasHandle = false;
        Sword.isSharp = true;
        System.out.println("isSharp after = " + Sword.isSharp); // reassigned value = true
        Sword.damage();

        Sword.slash();

        System.out.println("\nWorking with non-static methods\n");
        sword1.harms(); // 0.0
        sword2.harms(); // 3.5 * 15 = 52.5
        sword3.harms(); // 10 * 25 = 250.0

    }
}
