package com.antsrl.springzon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Shopcut")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shopcut {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "shoppingCart_id")
    @JsonIgnoreProperties(value="shopcuts")
    private ShoppingCart shoppingCart;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties(value="shopcuts")
    private Product product;
}
