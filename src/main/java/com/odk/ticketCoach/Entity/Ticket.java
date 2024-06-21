package com.odk.ticketCoach.Entity;

import com.odk.ticketCoach.Entity.Enum.Categories;
import com.odk.ticketCoach.Entity.Enum.Priorites;
import com.odk.ticketCoach.Entity.Enum.Roles;
import com.odk.ticketCoach.Entity.Enum.Statuts;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private Categories categorie;

    private String Reponse;

    @Enumerated(EnumType.STRING)
    private Priorites priorite;

    @Enumerated(EnumType.STRING)
    private Statuts statut;

    @Enumerated(EnumType.STRING)
    private Roles role;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateCreation; // Utilisez LocalDateTime

    private boolean resolu=false;
}
