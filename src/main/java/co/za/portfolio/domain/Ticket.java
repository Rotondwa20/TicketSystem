package co.za.portfolio.domain;

@Builder
@Getter
@Entity
public class Ticket {

    private UUID ticketID;

    private String ticketTitle;
    private String ticketDescription;

    private LocalDateTime ticketCreatedDate;
    private LocalDateTime ticketUpdatedDate;

    private TicketStatus ticketStatus;
    private Priority ticketPriority;
    private Category ticketCategory;
    private Team team;
    private Users user;

    public Ticket(String ticketTitle, String ticketDescription, LocalDateTime ticketCreatedDate, LocalDateTime ticketUpdatedDate, TicketStatus ticketStatus, Priority ticketPriority, Category ticketCategory, Team team, Users user) {
        this.ticketTitle = ticketTitle;
        this.ticketDescription = ticketDescription;
        this.ticketCreatedDate = ticketCreatedDate;
        this.ticketUpdatedDate = ticketUpdatedDate;
        this.ticketStatus = ticketStatus;
        this.ticketPriority = ticketPriority;
        this.ticketCategory = ticketCategory;
        this.team = team;
        this.user = user;
    }

    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public void setTicketCreatedDate(LocalDateTime ticketCreatedDate) {
        this.ticketCreatedDate = ticketCreatedDate;
    }

    public void setTicketUpdatedDate(LocalDateTime ticketUpdatedDate) {
        this.ticketUpdatedDate = ticketUpdatedDate;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public void setTicketPriority(Priority ticketPriority) {
        this.ticketPriority = ticketPriority;
    }

    public void setTicketCategory(Category ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
