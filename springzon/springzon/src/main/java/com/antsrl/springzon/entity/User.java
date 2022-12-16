package com.antsrl.springzon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="shopping_cart_id")
    @JsonIgnoreProperties(value = "user")
    private Shoppingcart shoppingCart;
}
