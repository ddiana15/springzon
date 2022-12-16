package com.antsrl.springzon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double prezzo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="description_id")
    private Description description;
    @ManyToMany(mappedBy = "prodotti")
    @JsonIgnoreProperties(value = "prodotti")
    private List<Shoppingcart> shoppingCart;
}
