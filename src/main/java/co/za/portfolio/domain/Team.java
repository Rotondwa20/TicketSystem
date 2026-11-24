package co.za.portfolio.domain;

@Getter
@Builder
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID teamID;

    @Setter
    private String teamName;

    @Setter
    private String teamDescription;

    public Team (String teamName, String teamDescription){
        this.teamName = teamName;
        this.teamDescription= teamDescription;
    }
}
