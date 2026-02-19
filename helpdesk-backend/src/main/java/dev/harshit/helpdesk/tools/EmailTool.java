package dev.harshit.helpdesk.tools;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailTool {

    private final JavaMailSender mailSender;


    @Tool(description = "Send an email to the support team for creating a new ticket")
    public String sendEmailToSupportTeam(
            @ToolParam(description = "Customer email address associated with the ticket")
            String email,

            @ToolParam(description = "Short description or summary of the issue")
            String message
    ) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("harsht1021@gmail.com");
        mail.setSubject("New Support Ticket");
        mail.setText("""
                New support ticket received.

                Customer Email: %s
                Issue Summary:
                %s
                """.formatted(email, message));

        mailSender.send(mail);
        return "Support ticket email sent successfully";
    }
}
