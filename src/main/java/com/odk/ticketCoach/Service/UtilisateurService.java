package com.odk.ticketCoach.Service;

import com.odk.ticketCoach.Entity.Enum.Roles;
import com.odk.ticketCoach.Entity.Utilisateur;
import com.odk.ticketCoach.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    //PasswordEncoder passwordEncoder;

    public Utilisateur creerAdmin(Utilisateur Admin) {
        if (!Admin.getRole().equals(Roles.ADMIN)) {
            throw new IllegalArgumentException("Ce lien est pour l'insertion des admins");
        }
        //Admin.setMotDePasse(passwordEncoder.encode(Admin.getMotDePasse()));

        return utilisateurRepository.save(Admin);
    }
    public List<Utilisateur> listerFormateurs() {
        return utilisateurRepository.findByRole(Roles.FORMATEUR);
    }
}
