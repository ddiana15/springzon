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
    @OneToMany(mappedBy = "shoppingCart")
    @JsonIgnoreProperties(value = "shopping_Cart")
    private List<Product> prodotti;
    @OneToOne(mappedBy = "shoppingCart")
    private User user;

}
