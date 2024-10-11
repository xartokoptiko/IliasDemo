package gr.hepheastus.tutorial.iliasdemo.repositories

import gr.hepheastus.tutorial.iliasdemo.entities.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface MessageRepository : JpaRepository<Message, UUID> {
}