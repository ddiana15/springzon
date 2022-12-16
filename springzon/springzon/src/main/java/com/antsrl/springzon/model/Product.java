package com.antsrl.springzon.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantita;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id", referencedColumnName="id")
    @JsonManagedReference
    private Description descrizione;
    
    @ManyToMany(mappedBy="prodotti")
    Set<ShoppingCart> likes;
    
  // private ShoppingCart carrello;
    
    
    
}
