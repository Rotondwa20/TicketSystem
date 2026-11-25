package co.za.portfolio.dto.ticket;

import co.za.portfolio.domain.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class TicketResponse {


    private UUID ticketId;
    private String ticketTitle;
    private String ticketDescription;
    private LocalDateTime ticketCreatedDate;
    private LocalDateTime ticketUpdatedDate;
    private TicketStatus ticketStatus;
    private Priority ticketPriority;
    private Catergory ticketCategory;
    private Customer customer;
    private Users user;
}
