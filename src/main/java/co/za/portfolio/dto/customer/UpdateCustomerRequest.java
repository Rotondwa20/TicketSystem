package co.za.portfolio.dto.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateCustomerRequest {

        private String name;
        private String email;
        private String phoneNumber;
}
