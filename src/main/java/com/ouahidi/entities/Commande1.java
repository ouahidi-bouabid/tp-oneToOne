package com.ouahidi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
 @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Getter @Setter
public class Commande1 {
@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer IdCommande;
private Double montant;
private Integer creatDate;
@OneToOne
@JoinColumn(name="IdClient")
private Client1 client;
}
 