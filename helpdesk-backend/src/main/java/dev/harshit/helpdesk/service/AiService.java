package dev.harshit.helpdesk.service;

import dev.harshit.helpdesk.tools.EmailTool;
import dev.harshit.helpdesk.tools.TicketDatabaseTool;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class AiService {
    private final ChatClient chatClient;
    private final TicketDatabaseTool ticketDatabaseTool;
    private final EmailTool emailTool;

    @Value("classpath:/helpdesk-system.st")
    private Resource systemPrompt;

    public String getResponseFromAssistant(String query, String conversationId){
        return chatClient.prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))
                .user(query)
                .tools(ticketDatabaseTool, emailTool)
                .system(systemPrompt)
                .call()
                .content();
    }
    public Flux<String> streamResponseFromAssistant(String query, String conversationId){
        return this.chatClient.prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))
                .user(query)
                .tools(ticketDatabaseTool, emailTool)
                .system(systemPrompt)
                .stream()
                .content();
    }
}
