package co.za.portfolio.dto.customer;

import co.za.portfolio.domain.UsersRoles;
import lombok.Getter;

import java.util.UUID;

@Getter
public class CustomerResponse {

        private UUID userID;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private UsersRoles userRoles;

}
