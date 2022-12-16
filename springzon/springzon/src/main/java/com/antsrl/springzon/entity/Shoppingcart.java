package com.antsrl.springzon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
            joinColumns = { @JoinColumn(name = "shoppingcart_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
    )
    @JsonIgnoreProperties(value = "shopping_Cart")
    private List<Product> prodotti;
    @OneToOne(mappedBy = "shoppingCart")
    @JsonIgnoreProperties(value = "shoppingCart")
    @JsonIgnore
    private User user;

}
