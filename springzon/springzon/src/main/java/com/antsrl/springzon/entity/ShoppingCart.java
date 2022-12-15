package com.antsrl.springzon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="ShoppingCart")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShoppingCart {

    @Id
    @Column
    private Long id;

    @OneToOne(mappedBy = "ShoppingCart")
    private User user;
}
