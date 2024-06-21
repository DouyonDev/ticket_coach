package com.odk.ticketCoach.Repository;

import com.odk.ticketCoach.Entity.Enum.Roles;
import com.odk.ticketCoach.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    List<Utilisateur> findByRole(Roles role);
    Utilisateur findByUsername(String username);

}
