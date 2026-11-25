package co.za.portfolio.factory;

import co.za.portfolio.domain.Customer;

public class CustomerFactory {

    public static Customer createCustomer(
            String name,
            String email,
            String phoneNumber) {
        return Customer.builder()
                .name(name)
                .email(email)
                .phoneNumber(phoneNumber)
                .build();
    }

}