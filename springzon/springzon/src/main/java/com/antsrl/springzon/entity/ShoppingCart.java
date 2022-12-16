package com.antsrl.springzon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ShoppingCart")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShoppingCart {

    @Id
    @Column
    private Long id;

    @OneToOne(mappedBy = "shoppingCart")
    private User user;

    @OneToMany(mappedBy = "shoppingCart",fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "shoppingCart")
    private List<Shopcut> shopcuts;
}
