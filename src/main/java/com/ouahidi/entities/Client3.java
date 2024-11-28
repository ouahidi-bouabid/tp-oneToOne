package com.ouahidi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity

 @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Getter @Setter
public class Client3 {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdClient;
	private String nom;
	private String  email;
	@OneToOne
	@JoinTable(name = "T_Clients_Commandes_Associations",
			joinColumns =@JoinColumn( name ="idClient"),
            inverseJoinColumns = @JoinColumn( name =  "idCommande" ) )
    private Commande3 commande;
}
