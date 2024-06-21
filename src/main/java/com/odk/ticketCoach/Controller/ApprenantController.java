package com.odk.ticketCoach.Controller;

import com.odk.ticketCoach.Entity.Utilisateur;
import com.odk.ticketCoach.Service.UtilisateurService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ApprenantController {

    UtilisateurService utilisateurService;

    @PostMapping("/ajoutadmin")
    public void ajouterAdmin(@RequestBody Utilisateur admin) {
        utilisateurService.creerAdmin(admin);

    }
}
