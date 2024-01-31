package com.syaweb.backend.controller;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@GetMapping("")
	public String getUtilisateur() {
		return "utilisateur s'affiche";
	}
	
	@PostMapping
	public String posttUtilisateur() {
		return "creation utilisateur";
	}
	
	@PutMapping
	public String updateUtilisateur() {
		return "mise à jour utilisateur";
	}
	
	@DeleteMapping
	public String deleteUtilisateur() {
		return "utilisateur etait supprime";
	}
	
	
}
