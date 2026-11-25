package co.za.portfolio.factory;

import co.za.portfolio.domain.Users;
import co.za.portfolio.domain.UsersRoles;

public class UsersFactory {

    public static Users createUsers(
            String firstName,
            String lastName,
            String password,
            String email,
            UsersRoles userRoles) {
        return Users.builder()
                .firstName(firstName)
                .lastName(lastName)
                .password(password)
                .email(email)
                .userRoles(userRoles)
                .build();
    }
}
