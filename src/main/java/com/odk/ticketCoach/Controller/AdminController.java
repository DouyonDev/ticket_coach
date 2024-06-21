package com.odk.ticketCoach.Controller;

import com.odk.ticketCoach.Entity.Utilisateur;
import com.odk.ticketCoach.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping("/ajoutadmin")
    public ResponseEntity<Utilisateur> ajouterAdmin(@RequestBody Utilisateur admin) {
        Utilisateur savedAdmin = utilisateurService.creerAdmin(admin);
        return ResponseEntity.ok(savedAdmin);
    }

    @GetMapping("/formateurs")
    public List<Utilisateur> listerFormateurs() {
        return utilisateurService.listerFormateurs();
    }
}