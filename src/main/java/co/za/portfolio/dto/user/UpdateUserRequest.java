package co.za.portfolio.dto.user;

import co.za.portfolio.domain.UsersRoles;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UpdateUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private UsersRoles userRoles;
}
