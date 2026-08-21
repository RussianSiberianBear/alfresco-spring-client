package com.ecorp.alfresco.api;

import com.ecorp.alfresco.dto.auth.TicketBody;
import com.ecorp.alfresco.dto.auth.TicketEntry;
import com.ecorp.alfresco.dto.auth.ValidTicketEntry;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

public interface AuthenticationApi {

    @PostExchange(url = "/tickets")
    TicketEntry createTicket(@RequestBody TicketBody ticketBodyCreate);

    @GetExchange(url = "/tickets/-me-")
    ValidTicketEntry validateTicket();

    @DeleteExchange(url = "/tickets/-me-")
    Void deleteTicket();
}
