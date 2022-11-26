package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();

        accountHolder.firstName = "John";
        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312) 000-0000";

        //accountHolder.SSN = "000-00-0000";
        accountHolder.setSSN("000-00-0000");
        accountHolder.setSSN("111-11-1111");

        System.out.println(accountHolder.firstName);
        System.out.println(accountHolder.getSSN()); // 000-00-0000
        System.out.println(accountHolder);


    }
}
