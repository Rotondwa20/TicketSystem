package co.za.portfolio.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id  @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customerID;

    @Setter
    private String name;

    @Setter
    private String email;

    @Setter
    private String phoneNumber;

}
