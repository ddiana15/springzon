package com.antsrl.springzon.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
//test
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shopping_cart")
public class ShoppingCart {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToMany
    @JoinTable(
            name="SHODUCT",
            joinColumns=@JoinColumn(name="shopping_cart", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="product", referencedColumnName="id"))
    private List<Product> prodotti;
    
    
    
    
}
