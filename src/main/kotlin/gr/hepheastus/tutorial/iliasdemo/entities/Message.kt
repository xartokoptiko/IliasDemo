package gr.hepheastus.tutorial.iliasdemo.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import java.time.LocalDateTime
import java.util.UUID

@Entity
class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : UUID? = null

    var message : String? = null

    var created : LocalDateTime? = null

    var updated : LocalDateTime? = null

    @PrePersist
    fun prePersist(){
        created = LocalDateTime.now()
        updated = LocalDateTime.now()
    }

    @PreUpdate
    fun preUpdate(){
        updated = LocalDateTime.now()
    }

}