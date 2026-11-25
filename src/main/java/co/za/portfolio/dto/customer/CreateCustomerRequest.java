package co.za.portfolio.dto.customer;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CreateCustomerRequest {

        private String name;
        private String email;
        private String phoneNumber;

    }
