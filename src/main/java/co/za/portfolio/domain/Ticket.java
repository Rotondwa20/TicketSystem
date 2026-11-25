package co.za.portfolio.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor
@Entity
@Getter
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ticketID;

    private String ticketTitle;
    private String ticketDescription;

    private LocalDateTime ticketCreatedDate;
    private LocalDateTime ticketUpdatedDate;

    private TicketStatus ticketStatus;
    private Priority ticketPriority;

    private Catergory ticketCategory;

@ManyToOne
@JoinColumn(name = "customer_id")
    private Customer customer;

@ManyToOne
@JoinColumn(name = "user_id")
    private Users user;

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

    public void setUser(Users user) {
        this.user = user;
    }
}
