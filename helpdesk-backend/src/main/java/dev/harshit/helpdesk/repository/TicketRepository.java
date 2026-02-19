package dev.harshit.helpdesk.repository;

import dev.harshit.helpdesk.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
//    Optional<Ticket> findByTicketId(Long id);
    Optional<Ticket> findByEmail(String email);
}
