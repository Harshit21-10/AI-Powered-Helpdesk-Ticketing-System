package dev.harshit.helpdesk.controller;

import dev.harshit.helpdesk.service.AiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ai")
@CrossOrigin(origins = {
        "http://localhost:3000",
        "http://localhost:5173"
})
public class AiController {
    private final AiService service;
    @PostMapping("/helpdesk")
    public ResponseEntity<String> getResponse(@RequestBody String query, @RequestHeader String conversationId){
        System.out.println("Controller hit");
        System.out.println("Query = " + query);
        return ResponseEntity.ok(service.getResponseFromAssistant(query,conversationId));
    }

    @PostMapping("/stream")
    public Flux<String> streamResponse(@RequestBody String query, @RequestHeader String conversationId){
        return this.service.streamResponseFromAssistant(query, conversationId);
    }
}
