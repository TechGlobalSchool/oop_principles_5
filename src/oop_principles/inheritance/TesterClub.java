package oop_principles.inheritance;

public class TesterClub {
    public static void main(String[] args) {
        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);
        FrontendTester ft2 =  new FrontendTester("Alex", 29, "1998", "666", false);
        BackendTester bt2 = new BackendTester("Jane", 36, "1987", "123", false);

        Tester[] testers = {ft1, ft2, bt1, bt2}; // Polymorphic array

        /*
        Manual testers = 3
        Automation testers = 1
        Average age = 33
         */



    }
}
