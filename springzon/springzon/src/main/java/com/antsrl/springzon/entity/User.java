package com.antsrl.springzon.entity;

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
    private Shoppingcart shoppingCart;
}
