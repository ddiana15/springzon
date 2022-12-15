package com.antsrl.springzon.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="User")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name,surname,mail,password;
    @Column
    private Date dob;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shoppingCart_id",referencedColumnName = "id")
    private ShoppingCart shoppingCart;
}
