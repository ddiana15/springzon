package com.antsrl.springzon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.util.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
@Entity
public class Shoppingcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Shop_Product",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "shoppingcart_id") }
    )
    @JsonIgnoreProperties(value = "shopping_Cart")
    private List<Product> prodotti;
    @OneToOne(mappedBy = "shoppingCart")
    @JsonIgnoreProperties(value = "shoppingCart")
    private User user;

}
