package com.example.support_ticket_system.model;

import jakarta.persistence.*;
        import java.time.LocalDateTime;

@Entity  // Marks this class as a JPA entity (database table)
@Table(name = "tickets")  // Optional: Custom table name
public class Ticket {

    @Id  // Marks this as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments ID
    private Long id;

    @Column(nullable = false)  // Field cannot be null
    private String title;

    @Column(nullable = false, length = 500)  // Max length 500
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    // Default constructor (required for JPA)
    public Ticket() {
        this.createdAt = LocalDateTime.now(); // Set default timestamp
        this.status = "OPEN"; // Default status
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
