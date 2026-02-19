package dev.harshit.helpdesk.tools;

import dev.harshit.helpdesk.entity.Ticket;
import dev.harshit.helpdesk.service.TicketService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
@Setter
public class TicketDatabaseTool {
    private final TicketService ticketService;

    @Tool(description = "This tool helps to create new ticket in database.")
    public Ticket createTicketTool(@ToolParam(description = "This takes ticket details.") Ticket ticket){
        try {
            System.out.println("going to create ticket");
            System.out.println(ticket);
            return ticketService.createTicket(ticket);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Tool(description = "This tool help to get ticket by email.")
    public Ticket getTicketByUsernameTool(@ToolParam(description = "email of user whose ticket is required.") String email){
        return ticketService.getTicketByEmail(email);
    }
    @Tool(description = "This tool helps to update the ticket.")
    public Ticket updateTicketTool(@ToolParam(description = "new ticket details with ticket id.") Ticket ticket){
        return ticketService.updateTicket(ticket);
    }
    @Tool(description = "This tool helps to get current date time of system.")
    public String getCurrentDateTime(){
        return String.valueOf(System.currentTimeMillis());
    }
}
