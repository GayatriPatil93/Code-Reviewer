package com.grp.codereviwer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public String handleWebhook(@RequestBody String payload,
                                @RequestHeader(value = "X-GitHub-Event", required = false)String event){

        System.out.println("==== WEBHOOK RECEIVED ====");
        System.out.println("Event: " + event);
        System.out.println("Payload: " + payload);

        return "Received";
    }

}

