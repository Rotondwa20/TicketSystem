package co.za.portfolio.domain;

@Getter
@Builder
@Entity
public class Customer {

    @Id  @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customerID;

    @Setter
    private String name;

    @Setter
    private String email;

    @Setter
    private String phoneNumber;

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }




}
