package com.gabriellazar.orm.repository;

import com.gabriellazar.orm.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
