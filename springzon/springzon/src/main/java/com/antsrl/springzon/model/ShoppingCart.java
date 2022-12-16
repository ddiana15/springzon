package com.antsrl.springzon.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

//test
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shopping_cart", indexes = {
        @Index(name = "idx_shoppingcart_id_unq", columnList = "id", unique = true)
})
public class ShoppingCart {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String ultimoAggiornamento;
    
    @OneToOne(mappedBy = "cart")
    private User user;
    
    @ManyToMany
    @JoinTable(
            name="SHODUCT",
            joinColumns=@JoinColumn(name="shopping_cart", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="product", referencedColumnName="id"))
    Set<Product> prodotti;
    
    
}
