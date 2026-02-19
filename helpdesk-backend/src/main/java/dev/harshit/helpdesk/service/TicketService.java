package dev.harshit.helpdesk.service;

import dev.harshit.helpdesk.entity.Ticket;
import dev.harshit.helpdesk.repository.TicketRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    // create ticket
    public Ticket createTicket(Ticket ticket){
        ticket.setId(null);
        return ticketRepository.save(ticket);
    }

    //update ticket
    public Ticket updateTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    // get ticket logic
    public Ticket getTicketById(Long ticketId){
        return ticketRepository.findById(ticketId).orElse(null);
    }

    // get ticket by username
    public Ticket getTicketByEmail(String email){
        return ticketRepository.findByEmail(email).orElse(null);
    }
}
