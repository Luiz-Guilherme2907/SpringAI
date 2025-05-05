package br.com.guilherme.controller

import br.com.guilherme.service.ChatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GenerativeAIController (private val chatService: ChatService) {

    @GetMapping("ask-ai")
    fun askAI(prompt: String?) : String? {
            return chatService.getResponse(prompt)

    }

}