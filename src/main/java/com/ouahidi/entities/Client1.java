package com.ouahidi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity


 @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Setter @Getter

public class Client1 {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdClient;
	private String nom;
	private String  email;
}
