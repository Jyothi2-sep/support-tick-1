package com.example.support_ticket_system.repository;

import com.example.support_ticket_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository  // Optional annotation
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // Custom query method to find tickets by status
    List<Ticket> findByStatus(String status);
}
