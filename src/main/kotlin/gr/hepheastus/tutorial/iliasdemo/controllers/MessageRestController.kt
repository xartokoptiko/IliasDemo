package gr.hepheastus.tutorial.iliasdemo.controllers

import gr.hepheastus.tutorial.iliasdemo.entities.Message
import gr.hepheastus.tutorial.iliasdemo.services.MessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class MessageRestController(
    val messageService: MessageService
) {

    @GetMapping("/greet")
    fun greet(
        @RequestParam("name", defaultValue = "world") name: String
    ) = ResponseEntity.ok("Hello, $name!")

    @GetMapping("/messages")
    fun messages() = ResponseEntity.ok(messageService.getAllMessages())

    @PostMapping("/send")
    fun sendMessage(
        @RequestBody message: Message
    ) = ResponseEntity.ok().body(messageService.createMessage(message))



}