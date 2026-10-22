package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer customer = new Customer(
                "Alice Smith",
                "alice@example.com",
                1001,
                PowerAgreementType.SPOTPRICE);

        System.out.println(customer);

        customer.setName("Alice Hansen");
        customer.setEmail("alice.hansen@example.com");
        customer.setCustomerId(1010);
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println("\nEtter endring:");
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getAgreement());
    }
}
