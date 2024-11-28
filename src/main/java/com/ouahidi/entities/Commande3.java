package com.ouahidi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data  @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class Commande3 {
@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer IdCommande;
private Double montant;
private Integer creatDate;
@OneToOne
@JoinTable(name = "T_Clients_Commandes_Associations",       
joinColumns =@JoinColumn(name ="idCommande"),
inverseJoinColumns = @JoinColumn(name =  "idClient" ) )

private Client3 client;

}
