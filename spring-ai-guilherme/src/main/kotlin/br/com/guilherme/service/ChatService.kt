package br.com.guilherme.service

import org.springframework.ai.chat.model.ChatModel
import org.springframework.stereotype.Service

@Service
class ChatService (private val chatModel: ChatModel){

    fun getResponse(prompt: String?) : String? {
            return chatModel.call(prompt)
    }
}