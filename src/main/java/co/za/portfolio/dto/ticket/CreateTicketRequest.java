package co.za.portfolio.dto.ticket;

import co.za.portfolio.domain.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class CreateTicketRequest {


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
