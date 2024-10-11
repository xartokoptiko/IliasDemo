package gr.hepheastus.tutorial.iliasdemo.services

import gr.hepheastus.tutorial.iliasdemo.entities.Message
import gr.hepheastus.tutorial.iliasdemo.repositories.MessageRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MessageService(
    val messageRepository: MessageRepository
) {

    fun getAllMessages(): List<Message> = messageRepository.findAll()

    fun getOneMessageById(id : UUID) = messageRepository.findById(id)

    fun createMessage(message: Message) = messageRepository.saveAndFlush(message)

    fun updateMessage(message: Message) = messageRepository.save(message)

    fun deleteMessageById(id: UUID) = messageRepository.deleteById(id)

}