package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(5);

        customers.addCustomer(new Customer("Alice Smith", "alice@example.com", 1001,
                PowerAgreementType.SPOTPRICE));
        customers.addCustomer(new Customer("Bob Johnson", "bob@example.com", 1002,
                PowerAgreementType.NORGESPRICE));
        customers.addCustomer(new Customer("Charlie Rose", "charlie@example.com", 1003,
                PowerAgreementType.POWERSUPPORT));
        customers.addCustomer(new Customer("Diana Prince", "diana@example.com", 1004,
                PowerAgreementType.NORGESPRICE));
        customers.addCustomer(new Customer("Ethan Hunt", "ethan@example.com", 1005,
                PowerAgreementType.POWERSUPPORT));

        System.out.println("Antall kunder: " + customers.countNonNull());
        System.out.println("\nKunde med nummer 1003:");
        System.out.println(customers.getCustomer(1003));

        System.out.println("\nSletter kunde 1002:");
        System.out.println(customers.removeCustomer(1002));

        System.out.println("\nKunder som er igjen:");
        for (Customer customer : customers.getCustomers()) {
            System.out.println(customer);
            System.out.println();
        }

    }
}
