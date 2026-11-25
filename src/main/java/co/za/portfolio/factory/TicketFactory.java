package co.za.portfolio.factory;

import co.za.portfolio.domain.*;

public class TicketFactory {

    public static Ticket createTicket(
            String ticketTitle,
            String ticketDescription,
            TicketStatus ticketStatus,
            Priority ticketPriority,
            Catergory ticketCategory,
            Customer customer,
            Users users
    ) {
        return Ticket.builder()
                .ticketTitle(ticketTitle)
                .ticketDescription(ticketDescription)
                .ticketStatus(ticketStatus)
                .ticketPriority(ticketPriority)
                .ticketCategory(ticketCategory)
                .customer(customer)
                .user(users)
                .ticketCreatedDate(java.time.LocalDateTime.now())
                .build();
    }
}
