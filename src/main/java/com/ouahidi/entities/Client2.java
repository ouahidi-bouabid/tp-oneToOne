package com.ouahidi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity


@AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Getter @Setter

public class Client2 {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdClient;
	private String nom;
	private String  email;
	@OneToOne(mappedBy="client")
	private Commande2 commande;
}
